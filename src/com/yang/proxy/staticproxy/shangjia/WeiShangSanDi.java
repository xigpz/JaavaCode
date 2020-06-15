package com.yang.proxy.staticproxy.shangjia;

import com.yang.proxy.staticproxy.factory.UsbKingFactory;
import com.yang.proxy.staticproxy.factory.UsbSanFactory;
import com.yang.proxy.staticproxy.service.UsbSell;

public class WeiShangSanDi implements UsbSell {
    //代理的 是闪迪，定义目标厂家类
    private UsbSanFactory factory = new UsbSanFactory();
    @Override
    public float sell(int amount) {
        //调用方法
        float price = factory.sell(amount);
        //只增加1元
        price = price + 1;
        return price;
    }
}
