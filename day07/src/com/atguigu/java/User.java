package com.atguigu.java;

import java.util.Objects;

/**
 * @auther kuikui
 * @create 2020-05-31 16:29
 */
public class User implements Comparable{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("USER equals....");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //按照姓名从大到小排序,年龄从小到大排序
    @Override
    public int compareTo(Object o) {
        if (o instanceof User){
            User user = (User) o;
//            return -this.name.compareTo(user.name);
            int compare = -this.name.compareTo(user.name);
            if (compare != 0){
                return compare;
            }else{
                return Integer.compare(this.age,user.age);
            }
        }else{
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}
