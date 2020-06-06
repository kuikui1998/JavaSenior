package com.atguigu.java1;

import java.io.Serializable;

/**
 * @auther kuikui
 * @create 2020-06-06 10:50
 */
public class Creature<T> implements Serializable {

    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }

}
