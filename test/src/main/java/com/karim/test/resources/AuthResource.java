package com.karim.test.resources;

import com.karim.test.Constants;
import com.karim.test.domain.User;
import com.karim.test.services.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthResource {

    @Autowired
    UserService userService;

    @PostMapping("/")
    public ResponseEntity<Map<String, String>> loginUser(@RequestBody Map<String, Object> userMap) {
        String login_code = (String) userMap.get("username");
        String password = (String) userMap.get("password");
        User user = userService.validateUser(login_code, password);
        return new ResponseEntity<>(generateJWTToken(user), HttpStatus.OK);
    }

    private Map<String, String> generateJWTToken(User user) {
        long timestamp = System.currentTimeMillis();
        String token = Jwts.builder().signWith(SignatureAlgorithm.HS256, Constants.API_SECRET_KEY)
                .setIssuedAt(new Date(timestamp))
                .setExpiration(new Date(timestamp + Constants.TOKEN_VALIDITY))
                .claim("id", user.getId())
                .claim("name", user.getName())
                .claim("login_code", user.getLogin_code())
                .claim("password", user.getPassword())
                .claim("created_at", user.getCreated_at())
                .claim("created_by", user.getCreated_by())
                .claim("updated_at", user.getUpdated_at())
                .claim("updated_by", user.getUpdated_by())
                .compact();
        Map<String, String> map = new HashMap<>();
        map.put("token", token);
        return map;
    }
}
