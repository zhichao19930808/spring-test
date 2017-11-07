package xin.zcglory.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xin.zcglory.entity.factory.InkBox;
import xin.zcglory.entity.factory.InkBoxFactory;
import xin.zcglory.entity.factory.impl.CSInkBox;
import xin.zcglory.entity.factory.impl.HBInkBox;

public class FactoryTest {
    public static void main(String[] args) {
        InkBoxFactory factory = new InkBoxFactory();

        //创建一个彩色的墨盒
        CSInkBox csInkBox = (CSInkBox) factory.getInkBox("彩色");
        csInkBox.createInkBox();
//        //创建一个黑白的墨盒
        HBInkBox hbInkBox= (HBInkBox) factory.getInkBox("黑白");
        hbInkBox.createInkBox();

        System.out.println("---------接口-----------");
        //使用接口
        InkBox inkBox1 = factory.getInkBox("黑白");
        InkBox inkBox2 = factory.getInkBox("彩色");
        inkBox1.createInkBox();
        inkBox2.createInkBox();

        System.out.println("---------spring-----------");
        //使用spring
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        InkBox inkBox = (InkBox) context.getBean("CsInkBox");
        inkBox.createInkBox();

    }




}
