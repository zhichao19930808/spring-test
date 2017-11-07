package xin.zcglory.entity.factory;

import xin.zcglory.entity.factory.impl.CSInkBox;
import xin.zcglory.entity.factory.impl.HBInkBox;

/**
 * 工厂模式
 *
 */
public class InkBoxFactory {
    //成产墨盒的实例
    public InkBox getInkBox(String color) {
        if ("黑白".equals(color)) {
            return new HBInkBox();
        }
        if ("彩色".equals(color)) {
            return new CSInkBox();
        }
        return null;
    }
}
