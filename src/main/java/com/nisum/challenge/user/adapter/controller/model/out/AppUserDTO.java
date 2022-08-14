package com.nisum.challenge.user.adapter.controller.model.out;

import com.nisum.challenge.user.adapter.controller.model.Phones;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class AppUserDTO {
    private String id;
    private String name;
    private String email;
    private String token;
    private LocalDateTime registered;
    private LocalDateTime updated;
    private LocalDateTime lastLogin;
    private List<Phones> phones;
    private String state;

}
