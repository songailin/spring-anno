package com.enjoy.cap10.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DaoProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object object, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("====Before method invoke====");
        methodProxy.invokeSuper(object, objects);
        System.out.println("====After method invoke====");
//        System.out.println("method=" + method);
        return object;
    }
}
