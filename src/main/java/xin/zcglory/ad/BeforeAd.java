package xin.zcglory.ad;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

public class BeforeAd implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, @Nullable Object target) throws Throwable {
        System.out.println("------------------前置增强，进入方法----------------------------");
    }
}
