package com.cncodehub.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncServiceImpl implements AsyncService{

    @Override
    @Async
    public void getLog() {
        //生成日志
        //存储日志
    }

}
