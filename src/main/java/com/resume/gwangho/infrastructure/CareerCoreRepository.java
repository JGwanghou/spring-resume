package com.resume.gwangho.infrastructure;

import com.resume.gwangho.infrastructure.jpa.CareerJpaRepository;
import com.resume.gwangho.model.Career;
import com.resume.gwangho.repository.CareerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CareerCoreRepository implements CareerRepository {
    private final CareerJpaRepository careerJpaRepository;

    @Override
    public List<Career> findByUserId(Long userId) {
        return careerJpaRepository.findByUserId(userId);
    }
}
