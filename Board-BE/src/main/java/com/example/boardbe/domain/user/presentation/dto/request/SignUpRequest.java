package com.example.boardbe.domain.user.presentation.dto.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignUpRequest {

    @NotBlank(message = "계정아이디는 null,공백,띄어쓰기 포함안합니다.")
    @Size(min = 8, max = 15, message = "최소 8자에서 15자 사이로 입력가능합니다.")
    private String accountId;

    @NotBlank(message = "이름은 공백,띄어쓰기 포함안합니다.")
    @Size(min = 1, max = 5, message = "최소 1자에서 5자 사이로 입력가능합니다.")
    private String name;

    @NotBlank(message = "비밀번호는 null,공백,띄어쓰기를 허용하지 않습니다.")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\\\\\d~!@#$%^&*()+|=]{8,20}$")
    @Size(min = 8, max = 20, message = "최소 8자 ~ 20자 까지 입력 가능합니다.")
    private String password;

    @NotBlank(message = "전화번호는 null,공백,띄어쓰기 허용하지않습니다.")
    @Size(min = 8, max = 20, message = "최소 8자 ~ 20자 까지 입력 가능합니다.")
    private String phoneNumber;
}

