package com.resume.gwangho.infrastructure.jpa;

import com.resume.gwangho.model.Activity;
import com.resume.gwangho.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectJpaRepository extends JpaRepository<Project, Long> {
    List<Project> findByUserId(Long userId);
}
