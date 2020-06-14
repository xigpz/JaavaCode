package com.yang.reflection;

import com.yang.reflection.entity.Hero;

public class GetObjectReflection {
    public static void main(String[] args) {
        String className = "com.yang.entity.Hero";
        try {
            Class pClass1 = Class.forName(className);
            Class pClass2 = Hero.class;
            Class pClass3 = new Hero().getClass();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
