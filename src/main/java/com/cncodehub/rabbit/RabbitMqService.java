package com.cncodehub.rabbit;

import com.cncodehub.entity.User;

public interface RabbitMqService {
    //发送字符串消息
    public void sendMsg(String msg);

    //发送用户消息
    public void sendUser(User user);

}
