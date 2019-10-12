package com.cbc.pojo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: springbootdemo
 * @Date: 2019/10/10 12:54
 * @Author: Mr.Deng
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "jwt")
public class JWT {
   private Logger logger = LoggerFactory.getLogger(getClass());

//   密钥
   private String secret;
//    用户凭证
   private String header;
//    过期时间
   private long expire;

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public long getExpire() {
        return expire;
    }

    public void setExpire(long expire) {
        this.expire = expire;
    }

//    生成token
    public String generateToken(int user_id){
        System.out.println("header"+getHeader()+"secret"+getSecret()+"expire"+getExpire());
        Date nowDate = new Date();
//        过期时间
        Date expireDate = new Date(nowDate.getTime() + getExpire()*1000);

        return Jwts.builder().setHeaderParam("typ","JWT").setSubject(String.valueOf(user_id)).setIssuedAt(nowDate)
                .setExpiration(expireDate).signWith(SignatureAlgorithm.HS512,getSecret()).compact();

    }

    public Claims getClaimByToken(String token){
        try {
            return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        } catch (Exception e) {
            logger.debug("validate is token error ", e);
            return null;
        }





    }

//    判断token是否过期
    public boolean isTokenExpired(Date expiration){
        return expiration.before(new Date());
    }
}
