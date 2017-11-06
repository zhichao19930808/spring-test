package xin.zcglory.entity;

/**
 * 单例
 * 单例模式限制了类实力的创建，采用这种模式设计的类，可保证有且只有一个实例，并提供访问该实例的全局访问点。
 */
public class SingleCase {
    private int id;
    private String name;

    //将构造方法设置为私有
    private SingleCase() {
    }

    //创建一个实例
    private static SingleCase singleCase = new SingleCase();

    //提供获取该实例的方法


    public static SingleCase getSingleCase() {
        if (singleCase == null) {
            singleCase = new SingleCase();
        }
        return singleCase;
    }
}
