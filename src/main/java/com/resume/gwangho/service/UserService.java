package com.resume.gwangho.service;

import com.resume.gwangho.model.User;
import com.resume.gwangho.repository.ProfileApiGateway;
import com.resume.gwangho.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ProfileApiGateway profileApiGateway;

    public User findUser(Long userId) {
        return userRepository.findByIdOrThrow(userId);
    }
}
