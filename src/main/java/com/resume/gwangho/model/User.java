package com.resume.gwangho.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String address;
    private LocalDateTime birth;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String profileImage;
    private String text;

    @Builder
    public User(String name, String email, String phone, String address, String profileImage, String text, LocalDateTime birth) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.profileImage = profileImage;
        this.text = text;
        this.birth = birth;
    }

    public void updateProfile(String profileImage, String text) {
        this.profileImage = profileImage;
        this.text = text;
    }
}
