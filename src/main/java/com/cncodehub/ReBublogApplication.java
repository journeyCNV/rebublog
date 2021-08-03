package com.cncodehub;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ReBublogApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(ReBublogApplication.class, args);
    }

    @Value("${rabbitmq.queue.msg}")
    private String msgQueueName = null;

    @Value("${rabbitmq.queue.user}")
    private String userQueueName = null;

    /**
     * 创建两个消息队列
     */

    @Bean
    public Queue createQueueMsg(){
        //创建字符串消息队列，boolean值代表是否持久化消息
        return new Queue(msgQueueName,true);
    }

    @Bean
    public Queue createQueueUser(){
        //创建用户消息队列
        return new Queue(userQueueName,true);
    }

}
