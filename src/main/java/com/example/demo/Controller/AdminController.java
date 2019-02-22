package com.example.demo.Controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import com.example.demo.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AdminController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        model.addAttribute("user_name",user.getNickName());
        model.addAttribute("user_pic",user.getUserPic());
        return "/index";
    }
}
