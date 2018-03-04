package com.dl.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Administrator on 2018/3/4 0004.
 */
@Configuration
@ComponentScan("com.dl.highlight_spring4.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}

