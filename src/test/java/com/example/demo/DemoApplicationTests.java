package com.example.demo;

import com.example.demo.Untils.MailServiceUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private MailServiceUtils mailServiceUtils;
    @Scheduled(fixedRate = 3000)//定时任务3秒执行一次
    @Test
    void contextLoads() {
    }

    @Test
    public void test(){
        int i = 0;
        mailServiceUtils.sendMail("from_user@163.com","to_user@qq.com","主题"+i,"你好鸭!");
        i++;
    }
}
