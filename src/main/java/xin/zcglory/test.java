package xin.zcglory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xin.zcglory.entity.User;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //获取用户的会员属性
        User user = (User) context.getBean("user");
        System.out.println("该用户的会员名称："+user.getMember().getName());
        //获取该用户所有的家庭住址
        for (String home : user.getHome()) {
            System.out.println("该用户的住址有："+home);
        }
        //获取该用户所有的账号
        for (String key : user.getAccounts().keySet()) {
            System.out.println("key:"+key+"\tvalue:"+user.getAccounts().get(key).toString());
        }

    }
}
