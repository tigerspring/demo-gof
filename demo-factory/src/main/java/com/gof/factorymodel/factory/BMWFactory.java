package com.gof.factorymodel.factory;

import com.gof.factorymodel.factory.ifactory.FACTORYTYPE;
import com.gof.factorymodel.factory.ifactory.IFactory;
import com.gof.factorymodel.product.iproduct.IBMW;

public abstract class BMWFactory implements IFactory<IBMW>{

    public static BMWFactory getBMWFactory(FACTORYTYPE type){
        switch (type){
            case BMW320: return new BMW320factory();
            case BMW253: return new BMW253factory();
            default:    return null;
        }
    }

    public IBMW createCar(){
        System.out.println(this);
        return this.createBMW();
    }


    abstract IBMW createBMW();

}


