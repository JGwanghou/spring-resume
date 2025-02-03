package com.resume.gwangho.controller;

import com.resume.gwangho.model.User;
import com.resume.gwangho.usecase.ResumeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/resumes")
@RequiredArgsConstructor
public class ResumeController {
    private final ResumeUseCase resumeUseCase;

    @GetMapping("{userId}")
    public ResponseEntity<?> userInfo(@PathVariable Long userId) {
        return ResponseEntity.ok().body(resumeUseCase.resume(userId));
    }

    @GetMapping("{userId}/profile-image")
    public ResponseEntity<byte[]> getProfileImage(@PathVariable Long userId) {
        User user = resumeUseCase.findUser(userId);

        byte[] imageBytes = Base64.getDecoder().decode(user.getProfileImage());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
        headers.setCacheControl("max-age=3600");

        return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
    }
}
