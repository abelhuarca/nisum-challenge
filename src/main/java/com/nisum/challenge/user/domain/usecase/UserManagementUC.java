package com.nisum.challenge.user.domain.usecase;

import com.nisum.challenge.user.adapter.controller.model.in.UserRequest;
import com.nisum.challenge.user.adapter.controller.model.out.AppUserDTO;

import java.util.List;

public interface UserManagementUC {

    AppUserDTO register(UserRequest userRequest);
    List<AppUserDTO> listAppUser();
}
