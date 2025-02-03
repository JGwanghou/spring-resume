package com.resume.gwangho.usecase;

import com.resume.gwangho.controller.dto.ResumeDto;
import com.resume.gwangho.model.*;
import com.resume.gwangho.service.*;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ResumeUseCase {
    private static final Logger log = LoggerFactory.getLogger(ResumeUseCase.class);
    private final CareerService careerService;
    private final EducationService educationService;
    private final UserService userService;
    private final ProjectService projectService;
    private final ActiveService activeService;

    @Cacheable(value = "userInfo", key = "#userId")
    public ResumeDto resume(Long userId) {
        List<Career> careers = careerService.findCareers(userId);
        List<Education> educations = educationService.findEducations(userId);
        List<Project> projects = projectService.findProjects(userId);
        List<Activity> actives = activeService.findActives(userId);
        User user = userService.findUser(userId);

        return new ResumeDto(user, careers, educations, projects, actives);
    }

    public User findUser(Long userId) {
        return userService.findUser(userId);
    }
}
