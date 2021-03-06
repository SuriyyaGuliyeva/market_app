package com.project.market_app.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserInfoDto {
    private Long id;
    private String name;
    private String email;
    private String password;
}
