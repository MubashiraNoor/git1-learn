package com.mubashiranoor.user.repository;

import com.mubashiranoor.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User getUserByUserId(Long id);
}
