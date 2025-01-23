package com.resume.gwangho.service;

import com.resume.gwangho.model.Career;
import com.resume.gwangho.repository.CareerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CareerService {
    private final CareerRepository careerRepository;

    public List<Career> findCareers(Long userId){
        return careerRepository.findByUserId(userId);
    }
}
