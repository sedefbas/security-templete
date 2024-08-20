package com.example.spring_security_templete.user.mapper;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {
    private String jwt;
    private String message;
}
