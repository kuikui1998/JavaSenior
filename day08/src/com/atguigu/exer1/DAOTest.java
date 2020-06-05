package com.atguigu.exer1;

import java.util.List;

/**
 *
 * 定义一个测试类： 创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方 法来操作 User 对象，
 * 使用 Junit 单元测试类进行测试
 * @auther kuikui
 * @create 2020-06-03 15:07
 */
public class DAOTest {
    public static void main(String[] args) {

        DAO<User> dao = new DAO<>();

        dao.save("1001",new User(1001,34,"周杰伦"));
        dao.save("1002",new User(1002,32,"梁朝伟"));
        dao.save("1003",new User(1003,14,"周星驰"));

        dao.update("1003",new User(1003,30,"陈奕迅"));

        dao.delete("1002");

        List<User> list = dao.list();
//        System.out.println(list);
        list.forEach(System.out::println);
    }
}
