package com.sm.cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Controller
public class PageController {
    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @GetMapping("/")
    public String index(){
        return "redirect:/login.html";
    }


    @GetMapping("getEmailCode")
    public String getEmailCode(String email){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("牟哥<newonehashmap@163.com>");
        simpleMailMessage.setTo(email);
        simpleMailMessage.setSubject("邮箱验证码");
        //随机数
        String code= UUID.randomUUID().toString().substring(0,6);
        simpleMailMessage.setText(code);
        stringRedisTemplate.opsForValue().set(email,code,3, TimeUnit.MINUTES);
        javaMailSender.send(simpleMailMessage);

        return "OK";
    }
}
