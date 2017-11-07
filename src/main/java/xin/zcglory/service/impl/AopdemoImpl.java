package xin.zcglory.service.impl;

import xin.zcglory.service.AopDemo;

public class AopdemoImpl implements AopDemo {
    private xin.zcglory.dao.impl.AopdemoImpl dao = new xin.zcglory.dao.impl.AopdemoImpl();
    @Override
    public void add() {
        System.out.println("service层的add方法开始");
        System.out.println("执行service层的add方法");
        dao.add();
        System.out.println("service层的add方法结束");
    }

    @Override
    public void delete() {
        System.out.println("service层delete方法开始");
        System.out.println("执行service层delete方法");
        dao.delete();
        System.out.println("service层delete方法结束");


    }

    @Override
    public void query() {
        System.out.println("service层query方法开始");
        System.out.println("执行service层query方法");
        dao.query();
        System.out.println("service层query方法结束");

    }

    @Override
    public void update() {
        System.out.println("方法开始");
        System.out.println("执行service层update方法");
        dao.update();
        System.out.println("方法结束");

    }
}
