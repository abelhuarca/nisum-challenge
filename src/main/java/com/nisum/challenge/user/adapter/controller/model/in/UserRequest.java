package com.nisum.challenge.user.adapter.controller.model.in;

import com.nisum.challenge.user.adapter.controller.model.Phones;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class UserRequest {
    private String name;
    private String email;
    private String password;
    private List<Phones> phones;
}
