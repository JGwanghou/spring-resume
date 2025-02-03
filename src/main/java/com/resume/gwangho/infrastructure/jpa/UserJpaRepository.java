package com.resume.gwangho.infrastructure.jpa;

import com.resume.gwangho.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Long> {
}
