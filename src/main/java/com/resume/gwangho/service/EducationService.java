package com.resume.gwangho.service;

import com.resume.gwangho.model.Career;
import com.resume.gwangho.model.Education;
import com.resume.gwangho.repository.CareerRepository;
import com.resume.gwangho.repository.EducationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EducationService {
    private final EducationRepository educationRepository;

    public List<Education> findEducations(Long userId){
        return educationRepository.findByUserId(userId);
    }
}
