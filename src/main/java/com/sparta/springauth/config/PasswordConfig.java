package com.sparta.springauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig { // passwordConfig

    @Bean
    public PasswordEncoder passwordEncoder() { // passwordConfig
        return new BCryptPasswordEncoder(); // 비밀번호를 암호화하는 해쉬함수
    }
}