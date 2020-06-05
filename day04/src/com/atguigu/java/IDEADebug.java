package com.atguigu.java;

import org.junit.Test;

/**
 * @auther kuikui
 * @create 2020-05-29 15:23
 */
public class IDEADebug {

    @Test
    public void testStringBuffer(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());//4

        System.out.println(sb);//null

        StringBuffer sb1 = new StringBuffer(str);//抛异常
        System.out.println(sb1);//
    }

}
