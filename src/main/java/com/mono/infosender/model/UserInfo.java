package com.mono.infosender.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserInfo {
    private String name;
    private String email;
    private String phone;
}
