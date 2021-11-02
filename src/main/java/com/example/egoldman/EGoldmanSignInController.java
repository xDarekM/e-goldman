package com.example.egoldman;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EGoldmanSignInController {


    @GetMapping("/signin")
    public String singIn() {
        return "signIn";

    }

}
