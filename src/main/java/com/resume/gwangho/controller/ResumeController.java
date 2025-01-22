package com.resume.gwangho.controller;

import com.resume.gwangho.usecase.ResumeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ResumeController {

    private final ResumeUseCase resumeUseCase;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("title", "resume");
        return "index";
    }
}
