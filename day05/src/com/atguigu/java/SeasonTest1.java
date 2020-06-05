package com.atguigu.java;

/**
 * 使用enum关键字定义枚举类
 * 说明：定义的枚举类默认继承于class java.lang.Enum类
 *
 * @auther kuikui
 * @create 2020-05-30 11:26
 */
public class SeasonTest1 {

    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        //toString():
        System.out.println(summer);

//        System.out.println(Season.class.getSuperclass());

        System.out.println("******************************");
        //value():
        Season[] values = Season.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }
        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }

        //valueOf(String objName):返回枚举类中对象名时objName的对象
        Season winter = Season.valueOf("WINTER");
        //如果没有objName的枚举类对象，则抛异常IllegalArgumentException
//        Season winter = Season.valueOf("WINTER1");
        System.out.println(winter);

        winter.show();
    }

}

interface Info{
     void show();
}

//自定义枚举类
enum Season implements Info{

    //1.提供当前枚举类的对象，多个对象之间用“，”隔开，末尾对象用“；”结束
     SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
     SUMMER ("夏天","炎炎夏日"){
         @Override
         public void show() {
             System.out.println("宁夏");
         }
     },
     AUTUMN ("秋天","秋高气爽"){
         @Override
         public void show() {
             System.out.println("秋天不回来");
         }
     },
     WINTER ("冬天","冰天雪地"){
         @Override
         public void show() {
             System.out.println("大约在冬季");
         }
     };

    //2.声明Season对象的属性;private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //3.私有化类的构造器,并给对象属性赋值
    private Season(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4.其他诉求1：获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @Override
//    public void show() {
//        System.out.println("这是一个季节");
//    }

//    //4.其他诉求1：提供toString()
//
//    @Override
//    public String toString() {
//        return "Season{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}