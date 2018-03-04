package com.dl.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/4 0004.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + " !";
    }
}
