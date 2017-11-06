package xin.zcglory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xin.zcglory.entity.SingleCase;
import xin.zcglory.entity.User;

public class SingleCaseTest {
    public static void main(String[] args) {
        /*
        由于构造方法为私有的，所以将无法通过new 来创建实例
         */
//        SingleCase singleCase = new SingleCase();


        System.out.println("--------------------------------------------------------------------------------------------------------------");
        /*
        通过类提供的方法来获取实例
         */
        SingleCase singleCase1 = SingleCase.getSingleCase();
        SingleCase singleCase2 = SingleCase.getSingleCase();
        System.out.println(singleCase1);
        System.out.println(singleCase2);
        System.out.println("通过 singleCase1 和 singleCase2 可发现 两个实例的地址一样，是同一个实例");


        System.out.println("--------------------------------------------------------------------------------------------------------------");
        /*
        通过spring管理创建的实例默认就是单例模式，scope="singleton"可不写。
        <bean id="user" class="xin.zcglory.entity.User" scope="singleton">
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user1 = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println("通过 user1 和 user2 可发现 两个实例的地址一样，是同一个实例");


        System.out.println("--------------------------------------------------------------------------------------------------------------");
        /*
        通过改变scope属性，可改变模式为其他模式，如原型模式：
            <bean id="user" class="xin.zcglory.entity.User" scope="prototype">

         */
        User user3 = (User) context.getBean("user");
        User user4 = (User) context.getBean("user");
        System.out.println(user3);
        System.out.println(user4);
        System.out.println("通过 user3 和 user4 可发现 两个实例的地址不一样，不是同一个实例");
    }
}
