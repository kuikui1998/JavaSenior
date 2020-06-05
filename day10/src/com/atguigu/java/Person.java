package com.atguigu.java;

import java.io.Serializable;

/**
 *
 * Person需要满足如下要求，方可序列化
 * 1.需要实现接口：Serializable
 * 2.当前类提供一个全局常量：serialVersionUID
 * 3.除了当前Person类需要实现Serializable接口以外，还必须保证其内部所有属性
 *      也必须是可序列化的。(默认情况下，基本数据类型可序列化)
 *
 *
 * 补充：ObjectOutputStream和ObjectInputStream不能序列化static和transient修 饰的成员变量
 *
 *
 * @auther kuikui
 * @create 2020-06-05 10:13
 */
public class Person implements Serializable {

    public static final long serialVersionUID = 4213214252352L;

    private String name;
    private int age;
    private Account acct;

    public Person() {
    }

    public Person(String name, int age, Account acct) {
        this.name = name;
        this.age = age;
        this.acct = acct;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", acct=" + acct +
                '}';
    }
}

class Account implements Serializable{
    public static final long serialVersionUID = 4216895452352L;
    private double balance;

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(double balance) {
        this.balance = balance;
    }
}
