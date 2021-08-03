package com.cncodehub.async;

import com.cncodehub.common.lang.Result;
import com.cncodehub.timetask.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    //@Autowired
    //private NoticeService noticeService;

    @GetMapping("/page")
    public Result page(){
        //各种操作
        asyncService.getLog(); //产生日志
        //noticeService.job();
        return Result.succ200("OK");
    }

}
