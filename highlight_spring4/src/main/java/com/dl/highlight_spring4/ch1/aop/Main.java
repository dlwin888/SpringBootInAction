package com.dl.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2018/3/4 0004.
 */
public class Main {
    public static void main(String[] args) {
        // 1.使用AnnotationConfigApplicationContext 作为Spring 容器, 接收输入一个配置类作为参数
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();
        demoMethodService.add();

        context.close();
    }
}
