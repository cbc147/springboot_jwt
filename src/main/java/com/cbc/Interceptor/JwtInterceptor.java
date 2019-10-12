package com.cbc.Interceptor;

import com.cbc.pojo.JWT;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: springbootdemo
 * @Date: 2019/10/10 13:22
 * @Author: Mr.Deng
 * @Description:token拦截器
 */
@Component
public class JwtInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private JWT jwt;

    public static final String USER_KEY = "userId";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String servletPath = request.getServletPath();
//        判断是否需要拦截
        boolean isNotCheck = isNotCheck(servletPath);
        if (isNotCheck){
            return true;
        }
//        需要验证

            String token = request.getHeader("token");
            if (StringUtils.isEmpty(token)){
                throw new Exception("token error");
            }
            Claims claims = jwt.getClaimByToken(token);
            if (claims == null || claims.isEmpty()  ){
                throw new Exception("token error2");
            }
            if (jwt.isTokenExpired(claims.getExpiration())){
                throw new Exception("token error3");
        }

        request.setAttribute(USER_KEY,claims.getSubject());
        return true;
    }

    public boolean isNotCheck(String servletPath){
//        判断servletPath是否以 / 结尾，如果以 / 结尾则去掉 /
        servletPath = servletPath.endsWith("/")?
                servletPath.substring(0,servletPath.lastIndexOf("/"))
                :servletPath;
        System.out.println(servletPath);

        for(String path: NOT_CHECK_URL){
            if (path.endsWith("/**")){
                String pathStart = path.substring(0,path.lastIndexOf("/")+1);
                System.out.println("pathStart" + pathStart);
                if (servletPath.startsWith(pathStart)){
                    return true;
                }else{
                    String pathStart2 = path.substring(0,path.lastIndexOf("/"));
                    System.out.println("pathStart2" + pathStart2);
                    if (servletPath.equals(pathStart2)){
                        return true;
                    }
                }
            }else {
                if (servletPath.equals(path)){
                    return true;
                }
            }
        }
        return false;
    }

//    获取token
    public String getToken(HttpServletRequest request){
        String token = request.getHeader(jwt.getHeader());
        if (StringUtils.isEmpty(token)){
            token = request.getParameter(jwt.getHeader());
        }
        return token;
    }
    private static final String[] NOT_CHECK_URL = {"/test/**","/user/login/**"};
}
