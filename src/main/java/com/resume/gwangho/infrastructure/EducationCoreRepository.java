package com.resume.gwangho.infrastructure;

import com.resume.gwangho.model.Education;
import com.resume.gwangho.repository.CareerRepository;
import com.resume.gwangho.repository.EducationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class EducationCoreRepository implements EducationRepository {
    private final EducationJpaRepository educationJpaRepository;

    @Override
    public List<Education> findByUserId(Long userId) {
        return educationJpaRepository.findByUserId(userId);
    }
}
