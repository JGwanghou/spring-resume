package com.resume.gwangho.infrastructure.jpa;

import com.resume.gwangho.model.Activity;
import com.resume.gwangho.model.Career;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityJpaRepository extends JpaRepository<Activity, Long> {
    List<Activity> findByUserId(Long userId);
}
