package com.atguigu.java;

/**
 *
 * 使用同步方法处理继承Thread类的方式中的线程安全问题
 *
 * @auther kuikui
 * @create 2020-05-27 21:41
 */
class Window4 extends Thread{

    private static int ticket = 100;

    @Override
    public void run() {

        while(true){

               show();

        }

    }

    private static synchronized void  show(){//同步监视器：Window4.class
        //private static synchronized void  show(){//同步监视器：t1,t2,t3。此种解决方式是错误的
        if (ticket > 0) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket--;
        }
    }
}


public class WindowTest4 {

    public static void main(String[] args) {
        Window4 w1 = new Window4();
        Window4 w2 = new Window4();
        Window4 w3 = new Window4();

        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();
    }

}

