package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String home()
    {
//        model.addAttribute("users", userRepository.findAll());
        return "index";
    }
}
