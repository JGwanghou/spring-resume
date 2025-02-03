package com.resume.gwangho.infrastructure;

import com.resume.gwangho.infrastructure.jpa.ActivityJpaRepository;
import com.resume.gwangho.infrastructure.jpa.ProjectJpaRepository;
import com.resume.gwangho.model.Activity;
import com.resume.gwangho.model.Project;
import com.resume.gwangho.repository.ActiveRepository;
import com.resume.gwangho.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProjectCoreRepository implements ProjectRepository {
    private final ProjectJpaRepository projectJpaRepository;

    @Override
    public List<Project> findByUserId(Long userId) {
        return projectJpaRepository.findByUserId(userId);
    }
}
