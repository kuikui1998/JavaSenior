package com.atguigu.java;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @auther kuikui
 * @create 2020-06-05 12:08
 */
public class FilUtilsTest {
    public static void main(String[] args) {
        File srcFile = new File("day10\\test.jpg");
        File destFile = new File("day10\\test2.jpg");

        try {
            FileUtils.copyFile(srcFile,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
