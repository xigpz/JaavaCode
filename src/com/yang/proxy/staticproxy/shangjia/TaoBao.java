package com.yang.proxy.staticproxy.shangjia;

import com.yang.proxy.staticproxy.factory.UsbKingFactory;
import com.yang.proxy.staticproxy.service.UsbSell;

//taobao是一个商家，代理金士顿U盘的销售
public class TaoBao implements UsbSell {

    //声明 商家代理的厂家具体是谁
    private UsbKingFactory factory = new UsbKingFactory();

    @Override
    public float sell(int amount) {

        //向厂家发送订单，告诉厂家，我买了u盘，厂家发货
        float price = factory.sell(amount); //厂家的价格
        //商家需要加价，也就是代理要增加价格。
        price = price +25;//增强功能，代理累再完成目标类方法调用后，增强了功能。
        //在目标类的方法调用后，你做的其他功能，都是增强的意思。
        System.out.println("淘宝商家，给你返回一个优惠卷，或者红包");

        //增加价格
        return price;
    }
}
