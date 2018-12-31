package com.example.demo.Controller;

import com.example.demo.model.User;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private TestService testService;


    @RequestMapping("/test")
    @ResponseBody
    public List<User> home() throws Exception{

        //sendMsg.send_2("我是测试的rabbitmq");

        return testService.queryAllStudent();
    }
}
