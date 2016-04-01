package com.artivisi.auth.basic.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String allCategory() {
        return "Halo";
    }
    

}
