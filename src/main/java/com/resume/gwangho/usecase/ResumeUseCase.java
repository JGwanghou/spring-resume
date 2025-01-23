package com.resume.gwangho.usecase;

import com.resume.gwangho.controller.ResumeDto;
import com.resume.gwangho.model.Career;
import com.resume.gwangho.model.Education;
import com.resume.gwangho.model.User;
import com.resume.gwangho.service.CareerService;
import com.resume.gwangho.service.EducationService;
import com.resume.gwangho.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ResumeUseCase {
    private final CareerService careerService;
    private final EducationService educationService;
    private final UserService userService;

    public ResumeDto resume(Long userId) {
        List<Career> careers = careerService.findCareers(userId);
        List<Education> educations = educationService.findEducations(userId);
        User user = userService.findUser(userId);

        return new ResumeDto(user, careers, educations);
    }
}
