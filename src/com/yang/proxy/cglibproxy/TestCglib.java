package com.yang.proxy.cglibproxy;

import com.yang.proxy.cglibproxy.interceptor.MyMethodInterceptor;
import com.yang.proxy.cglibproxy.service.CglibService;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * Create by yanggm on 2020/6/16
 */
public class TestCglib {

    @Test
    public void testCglibAgent() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CglibService.class);
        // 设置enhancer的回调对象
        enhancer.setCallback(new MyMethodInterceptor());
        // 创建代理对象
        CglibService proxy = (CglibService) enhancer.create();
        // 通过代理对象调用目标方法
        proxy.sayHello();
        //因为sayOthers方法被final修饰，不能被子类覆盖，故而无法被代理
        proxy.sayOthers("小明");
    }
}