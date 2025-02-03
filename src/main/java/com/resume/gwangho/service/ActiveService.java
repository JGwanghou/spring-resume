package com.resume.gwangho.service;

import com.resume.gwangho.model.Activity;
import com.resume.gwangho.model.Project;
import com.resume.gwangho.repository.ActiveRepository;
import com.resume.gwangho.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActiveService {
    private final ActiveRepository activeRepository;

    public List<Activity> findActives(Long userId){
        return activeRepository.findByUserId(userId);
    }
}
