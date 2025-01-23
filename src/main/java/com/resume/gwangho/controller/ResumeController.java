package com.resume.gwangho.controller;

import com.resume.gwangho.usecase.ResumeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class ResumeController {
    private final ResumeUseCase resumeUseCase;

    @GetMapping("")
    public String index(Model model) {
//        ResumeDto resume = resumeUseCase.resume(1L);
//
//        Map<String, Object> map = new HashMap<>();
//        map.put("user", resume.getUser());
//        map.put("careers", resume.getCareers());
//        map.put("educations", resume.getEducations());
//
//        System.out.println("map : " + map.toString());
//        model.addAttribute("data", map);
        return "test1";
    }
}
