package com.resume.gwangho.repository;

import com.resume.gwangho.model.User;

public interface UserRepository {
    User findByIdOrThrow(Long userId);
}
