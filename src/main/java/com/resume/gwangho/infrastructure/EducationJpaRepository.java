package com.resume.gwangho.infrastructure;

import com.resume.gwangho.model.Career;
import com.resume.gwangho.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationJpaRepository extends JpaRepository<Education, Long> {
}
