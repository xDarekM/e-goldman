package com.example.egoldman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EGoldmanSignUpController {

    @GetMapping("/signup")
    public String singIn() {
        return "sign-up";

    }
}
