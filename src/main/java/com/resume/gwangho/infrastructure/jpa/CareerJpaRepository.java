package com.resume.gwangho.infrastructure.jpa;

import com.resume.gwangho.model.Career;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CareerJpaRepository extends JpaRepository<Career, Long> {
    List<Career> findByUserId(Long userId);
}
