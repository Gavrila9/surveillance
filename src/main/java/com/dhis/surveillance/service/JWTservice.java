package com.dhis.surveillance.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.dhis.surveillance.vo.User;
import org.springframework.stereotype.Service;

@Service("JWTservice")
public class JWTservice {
    public String getToken(User user) {
        String token="";
        token= JWT.create().withAudience(user.getUserid())
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }
    public String delToken() {
        String token="";
        return token;
    }
}
