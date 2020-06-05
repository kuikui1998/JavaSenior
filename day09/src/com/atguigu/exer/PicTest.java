package com.atguigu.exer;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @auther kuikui
 * @create 2020-06-04 20:05
 */
public class PicTest {

    //图片的加密
    @Test
    public void test1(){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("test.jpg"));
            fos = new FileOutputStream(new File("testSecret.jpg"));

            byte[] buffer = new byte[20];
            int len;
            while ((len = fis.read(buffer)) != -1){
                //字节数组进行修改
                //错误的
    //            for (byte b : buffer){
    //                b = (byte) (b ^ 5);
    //            }
                //正确的：
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }

                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                //
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null){

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }

    //图片的解密
    @Test
    public void test2(){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("testSecret.jpg"));
            fos = new FileOutputStream(new File("test4.jpg"));

            byte[] buffer = new byte[20];
            int len;
            while ((len = fis.read(buffer)) != -1){
                //字节数组进行修改
                //错误的
                //            for (byte b : buffer){
                //                b = (byte) (b ^ 5);
                //            }
                //正确的：
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }

                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                //
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null){

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }

}
