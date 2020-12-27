package v1.pizza;

public class PizzaStore{
    Pizza pizza;

    public Pizza orderPizza(String type){
        //创建过程是可变更的,所以需要封装。封装成的类为工厂类。
        /** 变更的代码段 begin */
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }
        if(type.equals("greek")){
            pizza = new GreekPizza();
        }
        if(type.equals("PepperoniPizza")){
            pizza = new PepperoniPizza();
        }
        /** 变更的代码段 end */
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
