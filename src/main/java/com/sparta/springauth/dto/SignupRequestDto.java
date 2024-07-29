package com.sparta.springauth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    // @Pattern(regexp = "^(.+)@(.+)$") // 문자 가운데에 @만 있으면된다.
//    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$") // 대소문자영어 가능 숫자가능 ,특수문자(-_제외)X 한글 X
    @Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    @NotBlank
    private String email;
    private boolean admin = false;
    private String adminToken = "";
}
