package com.pesuio.smssenderdemo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SendFile {

    @GetMapping("/helloFromFile")
    public String helloFromFile(){
        return "hello";
    }
}
