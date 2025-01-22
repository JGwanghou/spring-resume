package com.resume.gwangho.infrastructure;

import com.resume.gwangho.repository.CareerRepository;
import com.resume.gwangho.repository.EducationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class EducationCoreRepository implements EducationRepository {
    private final EducationJpaRepository educationJpaRepository;

}
