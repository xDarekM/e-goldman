package com.example.egoldman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EGoldmanMainController {

    @GetMapping("/")
        public String main(){
            return "index";
    }


}
