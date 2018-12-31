package com.example.demo;

import com.example.demo.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private TestService testService;



    @Test
    public void contextLoads() {

//        List<PictureAudit> list = testService.getPictureAuditList();
//
//        if(list == null || list.size() == 0){
//            return;
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print("id:" + list.get(i).getId());
//            System.out.print("channelName:" + list.get(i).getChannelName());
//            System.out.print("getPictureUrl:" + list.get(i).getPictureUrl());
//            System.out.print("getSourcePicUrl:" + list.get(i).getSourcePicUrl());
//            System.out.print("getChannelid:" + list.get(i).getChannelid());
//            System.out.print("getCharmLevel:" + list.get(i).getCharmLevel());
//        }
    }


    @Test
    public void sendAndReceive_2(){
//        String testContent = "send msg via spring boot -2";
//        sendMsg.send_2(testContent);
//        try {
//            Thread.sleep(1000 * 10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

}
