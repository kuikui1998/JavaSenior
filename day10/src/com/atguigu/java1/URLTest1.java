package com.atguigu.java1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @auther kuikui
 * @create 2020-06-05 19:03
 */
public class URLTest1 {
    public static void main(String[] args) {
        HttpURLConnection urlConnection = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            URL url = new URL("http://localhost:80/examples/test.jpg");

            urlConnection = (HttpURLConnection) url.openConnection();

            urlConnection.connect();

            is = urlConnection.getInputStream();
            fos = new FileOutputStream("day10\\test3.jpg");

            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }

            System.out.println("图片下载完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                //关闭资源
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (urlConnection != null){
                urlConnection.disconnect();
            }
        }





    }




}
