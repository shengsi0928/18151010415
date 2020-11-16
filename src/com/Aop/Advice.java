package com.Aop;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Advice {
    public void BeforeAdvice(){
        System.out.println("所有方法都要执行本通知");
    }
    public void AfterAdvice(){
        System.out.println("所有方法运行后都要执行本通知");
    }

    public void BeforeLog(){
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
        String date1 = df1.format(new Date());
        System.out.println(date1);
    }

}
