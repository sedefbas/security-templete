package com.example.spring_security_templete.user.mapper;

import lombok.Data;

@Data
public class LoginRequestDto {
    private String email;
    private String password;
}
