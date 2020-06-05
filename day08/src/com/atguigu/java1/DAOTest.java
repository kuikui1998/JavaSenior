package com.atguigu.java1;

import org.junit.Test;

import java.util.List;

/**
 * @auther kuikui
 * @create 2020-06-03 10:20
 */
public class DAOTest {

    @Test
    public void test1(){
        CustomerDAO dao1 = new CustomerDAO();

        dao1.add(new Customer());
        List<Customer> list = dao1.getForList(10);


        StudentDAO dao2 = new StudentDAO();
        Student student = dao2.getIndex(1);

    }

}
