package com.example.users.controller;

import com.example.users.dto.*;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/multi-step")
public class MultiStepController {

    @GetMapping("/step1")
    public String step1(Model model, HttpSession session) {
        UserRegistrationDto user = (UserRegistrationDto) session.getAttribute("user");
        if (user == null)
            user = new UserRegistrationDto();
        model.addAttribute("user", user);
        return "step1";
    }

    @PostMapping("/step1")
    public String processStep1(@ModelAttribute UserRegistrationDto user, HttpSession session) {
        UserRegistrationDto sessionUser = (UserRegistrationDto) session.getAttribute("user");
        if (sessionUser == null)
            sessionUser = new UserRegistrationDto();

        sessionUser.setName(user.getName());
        sessionUser.setEmail(user.getEmail());

        session.setAttribute("user", sessionUser);
        return "redirect:/multi-step/step2";
    }

    @GetMapping("/step2")
    public String step2(Model model, HttpSession session) {
        UserRegistrationDto user = (UserRegistrationDto) session.getAttribute("user");
        if (user == null)
            return "redirect:/multi-step/step1"; // fallback
        model.addAttribute("user", user);
        return "step2";
    }

    @PostMapping("/step2")
    public String processStep2(@ModelAttribute UserRegistrationDto user, HttpSession session) {
        UserRegistrationDto sessionUser = (UserRegistrationDto) session.getAttribute("user");

        sessionUser.setAddress(user.getAddress());
        sessionUser.setCity(user.getCity());

        session.setAttribute("user", sessionUser);
        return "redirect:/multi-step/step3";
    }

    @GetMapping("/step3")
    public String step3(Model model, HttpSession session) {
        UserRegistrationDto user = (UserRegistrationDto) session.getAttribute("user");
        if (user == null)
            return "redirect:/multi-step/step1";
        model.addAttribute("user", user);
        return "step3";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute UserRegistrationDto user, HttpSession session, Model model) {
        UserRegistrationDto sessionUser = (UserRegistrationDto) session.getAttribute("user");

        sessionUser.setPhone(user.getPhone());
        model.addAttribute("user", sessionUser);

        session.removeAttribute("user");
        return "multiStepSuccess";
    }
}