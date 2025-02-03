package com.resume.gwangho.service;

import com.resume.gwangho.model.Career;
import com.resume.gwangho.model.Project;
import com.resume.gwangho.repository.CareerRepository;
import com.resume.gwangho.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;

    public List<Project> findProjects(Long userId){
        return projectRepository.findByUserId(userId);
    }
}
