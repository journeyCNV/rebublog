package com.cncodehub.async;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfig implements AsyncConfigurer {

    /**
     * 只需要配置文件,实现AsyncConfigurer接口
     * 实现getAsyncExecutor方法返回的线程池，
     * 这样Spring就将使用这个线程池作为其异步调用的线程
     */


    @Override
    public Executor getAsyncExecutor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(2); //核心线程数
        taskExecutor.setMaxPoolSize(4); //最大线程数
        taskExecutor.setQueueCapacity(4); //阻塞队列大小
        taskExecutor.initialize(); //初始化
        return taskExecutor;
    }
}
