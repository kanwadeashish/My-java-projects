package com.xworkz.login.controller;

import com.xworkz.login.DTO.StudentDTO;
import com.xworkz.login.service.PortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    PortalService portalService;

    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @GetMapping("/up")
    public String signUpPage() {
        return "signUp";
    }

    @GetMapping("/in")
    public String signInPage() {
        return "signIn";
    }

    @PostMapping("/signUp")
    public String signUp(StudentDTO dto, Model model) {

        String msg = portalService.signUp(dto);

        model.addAttribute(msg.contains("success") ? "success" : "errormsg", msg);

        return "index";
    }

    @PostMapping("/signIn")
    public String signIn(String email, String password, Model model) {

        boolean valid = portalService.loginValidation(email, password);

        if (valid) {

            StudentDTO dto = portalService.getUserByEmail(email);

            model.addAttribute("loginSuccessfully", "Login Successful");

            model.addAttribute("id", dto.getId());
            model.addAttribute("name", dto.getName());
            model.addAttribute("userName", dto.getUserName());
            model.addAttribute("email", dto.getEmail());
            model.addAttribute("contactNumber", dto.getContactNumber());

        } else {
            model.addAttribute("loginFailed", "Invalid Credentials");
        }

        return "loginSuccess";
    }

    @PostMapping("/updateData")
    public String update(StudentDTO dto, Model model) {

        boolean updated = portalService.updateUser(dto);

        model.addAttribute("loginSuccessfully",
                updated ? "Profile Updated Successfully" : "Update Failed");

        // send updated data back
        model.addAttribute("id", dto.getId());
        model.addAttribute("name", dto.getName());
        model.addAttribute("userName", dto.getUserName());
        model.addAttribute("email", dto.getEmail());
        model.addAttribute("contactNumber", dto.getContactNumber());

        return "loginSuccess";
    }
}