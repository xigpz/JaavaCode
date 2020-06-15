package com.yang.proxy.staticproxy.shangjia;

import com.yang.proxy.staticproxy.factory.UsbKingFactory;
import com.yang.proxy.staticproxy.service.UsbSell;

public class WeiShang implements UsbSell {
    //代理的 是金士顿，定义目标厂家类
    private UsbKingFactory factory = new UsbKingFactory();
    @Override
    public float sell(int amount) {
        //调用方法
        float price = factory.sell(amount);
        //只增加1元
        price = price + 1;
        return price;
    }
}
