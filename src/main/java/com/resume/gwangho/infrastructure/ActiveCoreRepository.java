package com.resume.gwangho.infrastructure;

import com.resume.gwangho.infrastructure.jpa.ActivityJpaRepository;
import com.resume.gwangho.infrastructure.jpa.CareerJpaRepository;
import com.resume.gwangho.model.Activity;
import com.resume.gwangho.model.Career;
import com.resume.gwangho.repository.ActiveRepository;
import com.resume.gwangho.repository.CareerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ActiveCoreRepository implements ActiveRepository {
    private final ActivityJpaRepository activityJpaRepository;

    @Override
    public List<Activity> findByUserId(Long userId) {
        return activityJpaRepository.findByUserId(userId);
    }
}
