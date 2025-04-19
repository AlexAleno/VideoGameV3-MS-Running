package com.example.apigatewayservice.presentationlayer;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseModel {
    private String userId;
    private String username;
    private String email;
    private double balance;
    private List<String> orders;
    private List<String> games;
}
