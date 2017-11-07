package xin.zcglory.dao.impl;

import xin.zcglory.dao.AopDemo;

public class AopdemoImpl implements AopDemo {
    @Override
    public void add() {
        System.out.println("dao层的add方法开始");
        System.out.println("执行dao层的add方法");
        System.out.println("dao层的add方法结束");
    }

    @Override
    public void delete() {
        System.out.println("dao层delete方法开始");
        System.out.println("执行dao层delete方法");
        System.out.println("dao层delete方法结束");


    }

    @Override
    public void query() {
        System.out.println("dao层query方法开始");
        System.out.println("执行dao层query方法");
        System.out.println("dao层query方法结束");

    }

    @Override
    public void update() {
        System.out.println("dao层update方法开始");
        System.out.println("执行dao层update方法");
        System.out.println("dao层update方法结束");

    }
}
