package com.resume.gwangho.infrastructure;

import com.resume.gwangho.model.Career;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CareerJpaRepository extends JpaRepository<Career, Long> {
}
