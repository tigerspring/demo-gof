package v2.pizza;

public class PizzaStore {
    Pizza pizza;

    public Pizza orderPizza(String type){
        //这个版本还是new了SimplePizzaFactory,通过静态方法创建pizza-》静态工厂方法
        /** 变更的代码段 begin */
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        pizza = simplePizzaFactory.createPizza(type);
        /** 变更的代码段 end */
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
