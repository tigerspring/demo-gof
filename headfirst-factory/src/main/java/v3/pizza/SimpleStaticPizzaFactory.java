package v3.pizza;

/**
 * 静态工厂模式
 */
public class SimpleStaticPizzaFactory {


    public static Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new CheesePizza();
        }
        if(type.equals("greek")){
            return new GreekPizza();
        }
        if(type.equals("PepperoniPizza")){
            return new PepperoniPizza();
        }
        return new CheesePizza();
    }
}
