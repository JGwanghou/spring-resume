package com.resume.gwangho.infrastructure;

import com.resume.gwangho.repository.EducationRepository;
import com.resume.gwangho.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserCoreRepository implements UserRepository {
    private final UserJpaRepository userJpaRepository;


}
