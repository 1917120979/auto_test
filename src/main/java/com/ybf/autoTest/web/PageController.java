package com.ybf.autoTest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String home(){
        return "redirect:index";
    }

    @GetMapping("/index")
    public String index(){
        return "pages/index";
    }

    @GetMapping("/project_list")
    public String projectList(){
        return "pages/project_list";
    }
}
