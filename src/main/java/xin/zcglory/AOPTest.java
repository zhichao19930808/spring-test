package xin.zcglory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xin.zcglory.service.impl.AopdemoImpl;

public class AOPTest {
    public static void main(String[] args) {
//        AopdemoImpl service = new AopdemoImpl();
//        service.add();


        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        AopdemoImpl service = (AopdemoImpl) context.getBean("aopdemoImpl");
        service.add();
    }
}
