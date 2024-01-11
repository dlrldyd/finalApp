package com.example.app.domain.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long userNumber;
    private String userId;
    private String userPassword;
    private String userGender;
    private String userEmail;
    private String userAddress;
}
