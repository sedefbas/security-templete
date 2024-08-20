package com.example.spring_security_templete.user.mapper;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterResponse {
    private String message;
}
