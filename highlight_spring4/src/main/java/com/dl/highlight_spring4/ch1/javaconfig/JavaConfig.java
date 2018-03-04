package com.dl.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/3/4 0004.
 */
@Configuration // 1.当前类是一个配置类
public class JavaConfig {
    @Bean // 2.当前该当返回的是一个Bean, Bean的名称是方法名
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

//    @Bean
//    public UseFunctionService useFunctionService(FunctionService functionService){
//        UseFunctionService useFunctionService = new UseFunctionService();
//        useFunctionService.setFunctionService(functionService);
//        return useFunctionService;
//    }
}
