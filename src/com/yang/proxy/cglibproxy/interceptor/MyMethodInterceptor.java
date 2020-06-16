package com.yang.proxy.cglibproxy.interceptor;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Create by yanggm on 2020/6/16
 */
public class MyMethodInterceptor implements MethodInterceptor {
    /**
     * @param o           代理对象
     * @param method      被代理的对象方法
     * @param objects     方法入参
     * @param methodProxy 代理方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("======插入前置通知======");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("======插入后置通知======");
        return object;
    }
}
