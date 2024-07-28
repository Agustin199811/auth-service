package com.uce.auth.Dto;

import lombok.Data;

@Data
public class UserMessage {
    private Long id;
    private String username;
    private String email;
    private String password;
    private boolean enabled;
    private String token;
}
