package v2.pizza;

/**
 * 简单工厂模式
 */
public class SimplePizzaFactory {

    Pizza pizza;

    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }
        if(type.equals("greek")){
            pizza = new GreekPizza();
        }
        if(type.equals("PepperoniPizza")){
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
