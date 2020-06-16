package com.yang.proxy.cglibproxy.service;

/**
 * Create by yanggm on 2020/6/16
 */
public class CglibService {
    public CglibService() {
        System.out.println("CglibService 构造方法");
    }

    /**
     * 该方法不能被子类覆盖,Cglib是无法代理final修饰的方法的
     *
     * @param name
     * @return
     */
    final public String sayOthers(String name) {
        System.out.println("CglibService final sayOthers:" + name);
        return null;
    }

    public void sayHello() {
        System.out.println("CglibService:sayHello");
    }
}