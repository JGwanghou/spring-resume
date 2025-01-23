package com.resume.gwangho.repository;

import com.resume.gwangho.model.Career;

import java.util.List;

public interface CareerRepository {
    List<Career> findByUserId(Long userId);
}
