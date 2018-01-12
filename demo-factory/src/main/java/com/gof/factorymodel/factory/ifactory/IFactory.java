package com.gof.factorymodel.factory.ifactory;

public interface IFactory<T> {

    <T> T createCar();

}
