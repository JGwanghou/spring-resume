package com.resume.gwangho.service;

import com.resume.gwangho.controller.dto.ProfileApiResponse;
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
        User user = userRepository.findByIdOrThrow(userId);
        if(user.getProfileImage() == null){
            ProfileApiResponse profileApiResponse = profileApiGateway.externalProfileData();

            user.updateProfile(profileApiResponse.getImg(), profileApiResponse.getText());
            return userRepository.save(user);
        }

        return user;
    }
}
