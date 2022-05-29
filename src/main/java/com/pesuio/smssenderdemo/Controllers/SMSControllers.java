package com.pesuio.smssenderdemo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SMSControllers {

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "hello";
    }
}
