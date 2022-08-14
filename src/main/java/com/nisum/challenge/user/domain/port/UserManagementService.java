package com.nisum.challenge.user.domain.port;

import com.nisum.challenge.user.domain.model.entity.AppUser;

import java.util.List;

public interface UserManagementService {
    AppUser findUserByEmail(String email);
    AppUser save(AppUser appUser);
    List<AppUser> listAppUser();
}
