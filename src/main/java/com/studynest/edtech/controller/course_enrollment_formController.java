package com.studynest.edtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class course_enrollment_formController {

    @GetMapping("/course_enroll")
    public String showQuizPage() {
        return "course_enrollment_form"; // Name of the HTML file (quiz.html)
    }
}
