package com.dl.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2018/3/4 0004.
 */
public class Main {
    public static void main(String[] args) {
        // 1.使用AnnotationConfigApplicationContext 作为Spring 容器, 接收输入一个配置类作为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        // 2.获得声明配置的UseFunctionService的 Bean
        UseFunctionService u = context.getBean(UseFunctionService.class);
        System.out.println(u.sayHello("duanle"));

        context.close();
    }
}
