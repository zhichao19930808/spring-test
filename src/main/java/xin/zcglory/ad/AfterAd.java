package xin.zcglory.ad;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

public class AfterAd implements AfterReturningAdvice {
    @Override
    public void afterReturning(@Nullable Object returnValue, Method method, Object[] args, @Nullable Object target) throws Throwable {
        System.out.println("------------------后置增强，方法结束----------------------------");
    }
}
