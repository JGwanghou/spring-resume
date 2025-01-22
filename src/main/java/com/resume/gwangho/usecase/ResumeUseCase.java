package com.resume.gwangho.usecase;

import com.resume.gwangho.service.CareerService;
import com.resume.gwangho.service.EducationService;
import com.resume.gwangho.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ResumeUseCase {
    private final CareerService careerService;
    private final EducationService educationService;
    private final UserService userService;


}
