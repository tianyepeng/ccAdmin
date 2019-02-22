package com.example.demo.Controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import com.example.demo.model.UserExample;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/")
    public String index(HttpServletRequest request) {

        return "redirect:" + request.getContextPath() + "/login";
    }

    @RequestMapping("/login")
    public String login() {
        return "/login";
    }


    @RequestMapping("/toLogin")
    @ResponseBody
    public Map login(String user_name, String password, HttpServletRequest request) throws Exception {

        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        try {

            ShiroToken token = new ShiroToken(username, password);
            SecurityUtils.getSubject().login(token);
            resultMap.put("code", 1000);
            resultMap.put("message", "登录成功");

        } catch (Exception e) {
            resultMap.put("status", 500);
            resultMap.put("message", e.getMessage());
        }
        return resultMap;
    }

    /**
     * 退出
     *
     * @return
     */
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> logout() {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        try {
            //退出
            SecurityUtils.getSubject().logout();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return resultMap;
    }
}
