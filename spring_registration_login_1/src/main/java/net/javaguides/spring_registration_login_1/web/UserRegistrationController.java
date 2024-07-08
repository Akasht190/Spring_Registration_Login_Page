package net.javaguides.spring_registration_login_1.web;

import net.javaguides.spring_registration_login_1.service.UserService;
import net.javaguides.spring_registration_login_1.web.dto.UserRegistrationdto;
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

    @ModelAttribute("user")
    public  UserRegistrationdto userRegistrationdto(){
        return  new UserRegistrationdto();
    }

    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public  String resisterUserAccount(@ModelAttribute("user") UserRegistrationdto userRegistrationdto){
        userService.save(userRegistrationdto);
        return  "redirect:/registration?success";
    }
}
