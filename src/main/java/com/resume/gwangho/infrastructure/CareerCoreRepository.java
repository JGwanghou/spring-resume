package com.resume.gwangho.infrastructure;

import com.resume.gwangho.repository.CareerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CareerCoreRepository implements CareerRepository {
    private final CareerJpaRepository careerJpaRepository;


}
