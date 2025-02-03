package com.resume.gwangho.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfileApiResponse {
    private String img;
    private String text;

    public ProfileApiResponse(String image, String text) {
        this.img = image;
        this.text = text;
    }
}
