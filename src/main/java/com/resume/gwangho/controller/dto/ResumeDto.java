package com.resume.gwangho.controller.dto;

import com.resume.gwangho.model.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Getter
@Setter
@ToString
public class ResumeDto {
    private UserDto user;
    private List<Career> careers;
    private List<Education> educations;
    private List<Project> projects;
    private List<Activity> activities;
    private String time;

    public ResumeDto(User user, List<Career> careers, List<Education> educations, List<Project> projects, List<Activity> activities) {
        this.user = new UserDto(user);
        this.careers = careers;
        this.educations = educations;
        this.projects = projects;
        this.activities = activities;
        this.time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
