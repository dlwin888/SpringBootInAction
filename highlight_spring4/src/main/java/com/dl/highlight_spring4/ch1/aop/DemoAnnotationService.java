package com.dl.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/4 0004.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){}
}
