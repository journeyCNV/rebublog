package com.cncodehub.timetask;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * 启用 Spring 的计划任务执行功能，类似于 Spring 的<task:*> XML 命名空间中的功能。 要使用@上Configuration类，如下所示：
 *    @Configuration
 *    @EnableScheduling
 *    public class AppConfig {
 *
 *        // various @Bean definitions
 *    }
 * 这可以检测容器中任何 Spring 管理的 bean 上的Scheduled注释
 */

@Configuration
@EnableScheduling
public class ScheduledConfig {
}
