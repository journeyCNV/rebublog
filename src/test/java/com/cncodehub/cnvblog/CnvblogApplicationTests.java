package com.cncodehub.cnvblog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter;

import java.lang.annotation.Annotation;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@SpringBootTest
class CnvblogApplicationTests {

    @Test
    void contextLoads() {
        //System.out.println(System.currentTimeMillis());//long
        //long time = System.currentTimeMillis();
        //System.out.println(timeFormat((long)1626038328408.0));

        //DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        //TimeZone timeZone = TimeZone.getTimeZone("Asia/Shanghai");
        //dateFormat.setTimeZone(timeZone);//设置系统时区

        /**
        long millisecond = time%1000;
        long totalseconds = time/1000;
        long currentSecond = totalseconds%60;
        long totalMinutes = totalseconds/60;
        long currentMinute = totalMinutes%60;
        long totalHour = totalMinutes/60;
        long currentHour = totalHour % 24;
         */

        //System.out.println(currentHour+" "+currentMinute+" "+currentSecond+" "+millisecond);
/**
        Date nowTime = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String nowTime1 = simpleDateFormat.format(nowTime);

        System.out.println(nowTime1);
*/

        System.out.println(timeFormat(System.currentTimeMillis()));
    }

    public String timeFormat(long millisTime){
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Shanghai");
        dateFormat.setTimeZone(timeZone);//设置系统时区
        Date exactTime = new Date(millisTime);
        System.out.println(exactTime); //Sun Jul 18 11:50:20 CST 2021
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        return simpleDateFormat.format(exactTime); //2021-07-18 11:50:20:214
    }

}
