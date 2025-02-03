package com.resume.gwangho.infrastructure.jpa;

import com.resume.gwangho.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EducationJpaRepository extends JpaRepository<Education, Long> {
    List<Education> findByUserId(Long userId);
}
