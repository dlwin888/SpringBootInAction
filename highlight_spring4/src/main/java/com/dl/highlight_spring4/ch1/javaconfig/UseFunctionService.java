package com.dl.highlight_spring4.ch1.javaconfig;

import com.dl.highlight_spring4.ch1.javaconfig.FunctionService;

/**
 * Created by Administrator on 2018/3/4 0004.
 */
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
