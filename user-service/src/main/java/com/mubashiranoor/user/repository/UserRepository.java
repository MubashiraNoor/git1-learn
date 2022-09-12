package com.mubashiranoor.user.repository;

import com.mubashiranoor.user.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserAccount,Long> {
    UserAccount getUserByUserId(Long id);
}
