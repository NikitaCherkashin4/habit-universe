package com.github.nikitacherkashi4.habituniverse.repository;

import com.github.nikitacherkashi4.habituniverse.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
