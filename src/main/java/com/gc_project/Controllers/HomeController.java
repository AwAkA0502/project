package com.gc_project.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping ("/")
public class HomeController {
    @GetMapping
    public String viewHomePage(){
        return "index";
    }
}
