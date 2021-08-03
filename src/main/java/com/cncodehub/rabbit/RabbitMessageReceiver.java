package com.cncodehub.rabbit;

import com.cncodehub.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMessageReceiver {
    @RabbitListener(queues = {"${rabbitmq.queue.msg}"})
    public void receiveMsg(String msg){
        System.out.println("收到消息："+msg);
    }

    @RabbitListener(queues = {"${rabbitmq.queue.user}"})
    public void receiveUser(User user){
        System.out.println("收到User："+user);
    }
}
