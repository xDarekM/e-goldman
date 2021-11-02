package com.example.egoldman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EGoldmanBillingController {

    @GetMapping("/billing")
    public String singIn() {
        return "billing";

    }

}
