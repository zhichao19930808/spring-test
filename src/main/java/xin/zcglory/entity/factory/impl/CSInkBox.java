package xin.zcglory.entity.factory.impl;

import xin.zcglory.entity.factory.InkBox;

public class CSInkBox implements InkBox {
    @Override
    public void createBinBox() {
        System.out.println("创建了一个彩色的墨盒！！！");
    }
}
