package com.example.users.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRegistrationDto {
    // @NotBlank(message = "Name is required")
    // private String name;

    // @Email(message = "Enter a valid email")
    // @NotBlank(message = "Email is required")
    // private String email;

    // @Size(min = 6, message = "Password must be at least 6 characters")
    // private String password;

    // @NotBlank(message = "Confirm password is required")
    // private String confirmPassword;

    // public String getName() {
    // return name;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }

    // public String getEmail() {
    // return email;
    // }

    // public void setEmail(String email) {
    // this.email = email;
    // }

    // public String getPassword() {
    // return password;
    // }

    // public void setPassword(String password) {
    // this.password = password;
    // }

    // public String getConfirmPassword() {
    // return confirmPassword;
    // }

    // public void setConfirmPassword(String confirmPassword) {
    // this.confirmPassword = confirmPassword;
    // }

    private String name;
    private String email;
    private String address;
    private String city;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
