package com.resume.gwangho.repository;

import com.resume.gwangho.model.Activity;
import com.resume.gwangho.model.Career;

import java.util.List;

public interface ActiveRepository {
    List<Activity> findByUserId(Long userId);
}
