package com.resume.gwangho.service;

import com.resume.gwangho.repository.CareerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CareerService {
    private final CareerRepository careerRepository;
}
