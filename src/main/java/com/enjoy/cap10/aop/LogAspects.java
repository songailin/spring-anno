package com.enjoy.cap10.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LogAspects {
    @Pointcut("execution(public int com.enjoy.cap10.aop.Calculator.*(..))")
    public void pointCut() {}

    /**
     * @Before使用
     * @param joinPoint
     */
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "运算......参数列表是：{" + Arrays.asList(joinPoint.getArgs()) + "}");
    }

    @After("pointCut()")
    public void logEnd() {
        System.out.println("除法结束......");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(Object result) {
        System.out.println("除法正常返回...运行结果是：{" + result +"}");
    }

    @AfterThrowing(value="pointCut()",throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("除法异常......异常信息是：{" + exception +"}");
    }

//    @Around("pointCut()")
//    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
//        Object proceed = null;
//        try {
//            System.out.println("around执行方法之前。");
//            proceed = proceedingJoinPoint.proceed();
//            System.out.println("around执行方法之后。");
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//        return proceed;
//    }
}
