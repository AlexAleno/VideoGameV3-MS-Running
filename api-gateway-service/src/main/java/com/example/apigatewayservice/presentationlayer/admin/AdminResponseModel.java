package com.example.apigatewayservice.presentationlayer.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminResponseModel {
    private String adminId;
    private String username;
}
