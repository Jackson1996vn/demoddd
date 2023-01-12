package com.example.demoddd.application.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetUserResponse {

    private Long id;

    private String name;

    private Integer age;

    private Boolean gender;
}
