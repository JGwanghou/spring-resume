package com.resume.gwangho.infrastructure;

import com.resume.gwangho.model.Career;
import com.resume.gwangho.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Long> {
}
