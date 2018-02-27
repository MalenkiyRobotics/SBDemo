package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

    private static String registeredPPP;

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Get: " + registeredPPP;
    }

    @RequestMapping("/reg/{ppp}")
    @ResponseBody
    String test(@PathVariable String ppp) {
      registeredPPP = ppp;
      return "Registered " + ppp;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}


