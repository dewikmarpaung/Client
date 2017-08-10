package com.womantalk.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/question", params = {"idQuiz"})
    public String question(@RequestParam(value = "idQuiz") int id)
    {
        return "question";
    }
}
