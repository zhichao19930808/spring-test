package xin.zcglory;

import xin.zcglory.entity.SingleCase;

public class SingleCaseTest {
    public static void main(String[] args) {
        /*
        由于构造方法为私有的，所以将无法通过new 来创建实例
         */
//        SingleCase singleCase = new SingleCase();


        /*
        通过类提供的方法来获取实例
         */
        SingleCase singleCase1 = SingleCase.getSingleCase();
        SingleCase singleCase2 = SingleCase.getSingleCase();
        System.out.println(singleCase1);
        System.out.println(singleCase2);
        System.out.println("通过 singleCase1 和 singleCase2 可发现 两个实例的地址一样，是同一个实例");
    }
}
