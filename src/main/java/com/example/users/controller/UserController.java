package com.example.users.controller;

import com.example.users.models.User;

import jakarta.validation.Valid;

import com.example.users.dto.UserRegistrationDto;
import com.example.users.models.Address;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    // @GetMapping("/form")
    // public String showForm(Model model) {
    // User user = new User();

    // user.setAddresses(List.of(new Address(), new Address()));
    // user.setPhones(List.of("", ""));

    // model.addAttribute("user", user);
    // return "userForm";
    // }

    // @PostMapping("/submit")
    // public String handleSubmit(@ModelAttribute User user, Model model) {
    // model.addAttribute("user", user);
    // return "userResult";
    // }

    // @GetMapping("/register")
    // public String showForm(Model model) {
    // model.addAttribute("user", new UserRegistrationDto());
    // return "registerForm";
    // }

    // @PostMapping("/register")
    // public String register(@ModelAttribute("user") @Valid UserRegistrationDto
    // user,
    // BindingResult result,
    // Model model) {

    // if (!user.getPassword().equals(user.getConfirmPassword())) {
    // result.rejectValue("confirmPassword", "error.user", "Passwords do not
    // match");
    // }

    // if (result.hasErrors()) {
    // return "registerForm";
    // }

    // model.addAttribute("name", user.getName());
    // return "registerSuccess";
    // }
}
