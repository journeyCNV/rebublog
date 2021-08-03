package com.cncodehub.timetask;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
    int count=1;

    @Scheduled(fixedDelay = 2*1000) //每隔一秒执行一次
    @Async //异步执行
    public void job(){
        if(count<50){
            System.out.println(Thread.currentThread().getName()+"每2秒执行1次，当前为第"+count+"次");
            count++;
        }
    }

                     //秒    分    时 天 月 星期 [年]
    @Scheduled(cron = "0 50,52,57 16 * * ?") //每天的16:35 、16:36、16:37 进行提醒
    @Async
    public void noticeJob(){
        System.out.println(Thread.currentThread().getName()+"到点了！快起来");
    }

    @Scheduled(cron = "${sync-notice.cron}")
    @Async
    public void noticeJob2(){
        System.out.println("Job2!!!");
    }

}
