package com.cncodehub.rabbit;

import com.cncodehub.common.lang.Result;
import com.cncodehub.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbitmq")
public class RabbitMqController {
    //注入Spring Boot 自定生成的对象
    @Autowired
    private RabbitMqService rabbitMqService = null;

    @GetMapping("/msg")
    public Result msg(@RequestParam String msg){
        rabbitMqService.sendMsg(msg);
        return Result.succ200(msg);
    }

    @GetMapping("/user")
    public Result user(@RequestParam String name){
        User user = new User();
        user.setUsername(name);
        rabbitMqService.sendUser(user);
        return Result.succ200(user);
    }

}
