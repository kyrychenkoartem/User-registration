package org.kyrychenko.User.registration.web.controller;

import org.kyrychenko.User.registration.service.UserService;
import org.kyrychenko.User.registration.web.dto.UserRegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

   private UserService userService;

    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping
    public String registrationForm() {
        return "registration";
    }

    @ModelAttribute("user")
    public UserRegistrationDTO userRegistrationDto() {
        return new UserRegistrationDTO();
    }

    @PostMapping
    public String registerUser(@ModelAttribute("user")UserRegistrationDTO userRegistrationDTO) {
         userService.save(userRegistrationDTO);
         return "redirect:/registration?success";
    }
}
