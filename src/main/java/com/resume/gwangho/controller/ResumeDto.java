package com.resume.gwangho.controller;

import com.resume.gwangho.model.Career;
import com.resume.gwangho.model.Education;
import com.resume.gwangho.model.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ResumeDto {
    private User user;
    private List<Career> careers;
    private List<Education> educations;

    public ResumeDto(User user, List<Career> careers, List<Education> educations) {
        this.user = user;
        this.careers = careers;
        this.educations = educations;
    }
}
