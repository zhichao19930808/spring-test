package xin.zcglory.entity.factory.impl;

import xin.zcglory.entity.factory.InkBox;

public class HBInkBox implements InkBox {
    @Override
    public void createInkBox() {
        System.out.println("创建了一个黑白的墨盒！！！");
    }
}
