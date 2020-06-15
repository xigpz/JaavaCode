package com.yang.proxy.staticproxy;

import com.yang.proxy.staticproxy.shangjia.WeiShang;

public class ShopMain {
    public static void main(String[] args) {
        //创建代理的商家taobao对象
//        TaoBao taoBao = new TaoBao();
//        float price = taoBao.shell(1);
//        System.out.println("通过淘宝的商家，购买u盘的价格：" + price);

        WeiShang weiShang = new WeiShang();
        float price = weiShang.sell(1);
        System.out.println("通过微商购买的价格：" + price);
    }
}
