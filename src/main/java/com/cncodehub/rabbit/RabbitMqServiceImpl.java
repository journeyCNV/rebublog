package com.cncodehub.rabbit;

import com.cncodehub.entity.User;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class RabbitMqServiceImpl implements RabbitMqService, RabbitTemplate.ConfirmCallback {

    @Value("${rabbitmq.queue.msg}")
    private String msgRouting = null;

    @Value("${rabbitmq.queue.user}")
    private String userRouting = null;

    @Autowired
    private RabbitTemplate rabbitTemplate = null;

    @Override
    public void sendMsg(String msg) {
        System.out.println("发送消息："+msg);
        //设置回调
        rabbitTemplate.setConfirmCallback(this);
        //发送消息
        rabbitTemplate.convertAndSend(msgRouting,msg);
    }

    @Override
    public void sendUser(User user) {
        System.out.println("发送User："+user);
        rabbitTemplate.setConfirmCallback(this);
        rabbitTemplate.convertAndSend(userRouting,user);
    }

    //回调确认方法
    @Override
    public void confirm(CorrelationData correlationData,boolean ack,String cause){
        if(ack){
            System.out.println("消息成功消费");
        }else {
            System.out.println("消息消费失败："+cause);
        }
    }

}
