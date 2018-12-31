package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {


    @RequestMapping("/")
    public String index(HttpServletRequest request) throws Exception{

        return "redirect:" + request.getContextPath() + "/login";
    }

    @RequestMapping("/login")
    public String login() throws Exception{
        return "/login";
    }




}
