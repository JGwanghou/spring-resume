package com.resume.gwangho.service;

import com.resume.gwangho.repository.CareerRepository;
import com.resume.gwangho.repository.EducationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EducationService {
    private final EducationRepository educationRepository;
}
