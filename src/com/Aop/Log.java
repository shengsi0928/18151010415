package com.Aop;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Log {
    public void BeforeLog(){
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
        DateFormat df2 = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
        String date1 = df1.format(new Date());
        String time1 = df2.format(new Date());
        System.out.println("事件运行开始时间：" + date1 + time1);
    }

    public void AfterLog(){
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
        DateFormat df2 = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
        String date1 = df1.format(new Date());
        String time1 = df2.format(new Date());
        System.out.println("事件运行结束时间：" + date1 + time1);
    }

    public void ReturnLog(){
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
        DateFormat df2 = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
        String date1 = df1.format(new Date());
        String time1 = df2.format(new Date());
        System.out.println("事件运行返回时间：" + date1 + time1);
    }

    public void ThrowLog(){
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
        DateFormat df2 = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
        String date1 = df1.format(new Date());
        String time1 = df2.format(new Date());
        System.out.println("事件抛出意外时间：" + date1 + time1);
    }
}

