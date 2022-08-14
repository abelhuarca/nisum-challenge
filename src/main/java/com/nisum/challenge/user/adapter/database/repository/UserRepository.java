package com.nisum.challenge.user.adapter.database.repository;

import com.nisum.challenge.user.domain.model.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<AppUser, String> {
    AppUser findUserByUsername(String username);
}
