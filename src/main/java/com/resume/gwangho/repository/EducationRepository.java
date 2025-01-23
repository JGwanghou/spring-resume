package com.resume.gwangho.repository;

import com.resume.gwangho.model.Education;

import java.util.List;

public interface EducationRepository {
    List<Education> findByUserId(Long userId);
}
