package com.resume.gwangho.repository;

import com.resume.gwangho.model.Project;

import java.util.List;

public interface ProjectRepository {
    List<Project> findByUserId(Long userId);
}
