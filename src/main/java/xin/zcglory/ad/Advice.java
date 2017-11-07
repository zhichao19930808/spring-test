package xin.zcglory.ad;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class Advice {

    @Before("execution(public * xin.zcglory.service.*.*(..))")
    public void beforeAd() {
        System.out.println("-----------注解：方法开始---------------------");
    }
    @After("execution(public * xin.zcglory.service.*.*(..))")
    public void afterAd() {
        System.out.println("-----------注解：方法结束---------------------");
    }
}
