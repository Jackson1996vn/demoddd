package com.example.demoddd.application.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreateUserRequest {

    @NotBlank
    private String name;

    @NotNull
    private Integer age;

    @NotNull
    private Boolean gender;
}
