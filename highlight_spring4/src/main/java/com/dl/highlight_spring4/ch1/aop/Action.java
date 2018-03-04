package com.dl.highlight_spring4.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2018/3/4 0004.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
