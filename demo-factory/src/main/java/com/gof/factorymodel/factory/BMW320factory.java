package com.gof.factorymodel.factory;

import com.gof.factorymodel.product.BMW320;
import com.gof.factorymodel.product.iproduct.IBMW;

import java.util.concurrent.TimeUnit;

public class BMW320factory extends BMWFactory{

    public IBMW createBMW(){
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("正在生产宝马320！");
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new BMW320();
    }
}
