package com.atguigu.exer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（下一章： TreeSet 需使用泛型来定义）
 * 分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 * 1). 使 Employee 实现 Comparable 接口，并按 name 排序
 * 2). 创建 TreeSet 时传入 Comparator 对象，按生日日期的先后排序。
 *
 * @auther kuikui
 * @create 2020-06-01 9:05
 */
public class EmployeeTest {

    //问题二：按生日日期的先后排序。
    @Test
    public void test2() {


        TreeSet<Employee> set = new TreeSet<>(new Comparator<Employee>() {
            //使用泛型以后的写法
            @Override
            public int compare(Employee o1, Employee o2) {
                MyDate b1 = o1.getBirthday();
                MyDate b2 = o2.getBirthday();

                return b1.compareTo(b2);
            }
            //使用泛型之前的写法
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Employee && o2 instanceof Employee) {
//                    Employee e1 = (Employee) o1;
//                    Employee e2 = (Employee) o2;
//
//                    MyDate b1 = e1.getBirthday();
//                    MyDate b2 = e2.getBirthday();
//
//                    //比较年
//                    int sumYear = b1.getYear() - b2.getYear();
//                    if (sumYear != 0) {
//                        return sumYear;
//                    }
//
//                    //比较月
//                    int sumMonth = b1.getMonth() - b2.getMonth();
//                    if (sumMonth != 0) {
//                        return sumMonth;
//                    }
//
//                    //比较日
//                    return b1.getDay() - b2.getDay();
//
//                }
//                throw new RuntimeException("传入的数据不一致！");
//            }
        });

        Employee e1 = new Employee("Tom", 12, new MyDate(2005, 5, 12));
        Employee e2 = new Employee("Jerry", 22, new MyDate(1997, 3, 4));
        Employee e3 = new Employee("Mike", 44, new MyDate(1978, 2, 16));
        Employee e4 = new Employee("Mary", 8, new MyDate(1988, 8, 25));
        Employee e5 = new Employee("Jim", 55, new MyDate(2005, 5, 5));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }


    //问题一：使用自然排序
    @Test
    public void test1() {
        TreeSet<Employee> set = new TreeSet<Employee>();

        Employee e1 = new Employee("Tom", 12, new MyDate(2005, 5, 12));
        Employee e2 = new Employee("Jerry", 22, new MyDate(1997, 3, 4));
        Employee e3 = new Employee("Mike", 44, new MyDate(1978, 2, 16));
        Employee e4 = new Employee("Mary", 8, new MyDate(1988, 8, 25));
        Employee e5 = new Employee("Jim", 55, new MyDate(2000, 11, 5));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {

            Employee employee = iterator.next();
            System.out.println(employee);
        }

    }

//    @Test
//    public void test3() {
//        HashSet set = new HashSet();
//        Person p1 = new Person(1001, "AA");
//        Person p2 = new Person(1002, "BB");
//
//        set.add(p1);
//        set.add(p2);
//
//        p1.name = "CC";
//        set.remove(p1);
//        System.out.println(set);
//        set.add(new Person(1001, "CC"));
//        System.out.println(set);
//        set.add(new Person(1001, "AA"));
//        System.out.println(set);
//    }

}
