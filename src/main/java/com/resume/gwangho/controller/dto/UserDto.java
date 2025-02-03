package com.resume.gwangho.controller.dto;

import com.resume.gwangho.model.User;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;


@Getter
@Setter
public class UserDto implements Serializable {
    Long id;
    String name;
    String email;
    String phone;
    String address;
    String profileImage;
    String text;
    String birth;

    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.address = user.getAddress();
        this.profileImage = "/api/v1/resumes/" + user.getId() + "/profile-image";
        this.text = user.getText();
        this.birth = user.getBirth().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}