package v3.pizza;

public class PizzaStore {
    Pizza pizza;

    public Pizza orderPizza(String type){
        //创建pizza过程没有new关键词
        /** 变更的代码段 begin */
        pizza = SimpleStaticPizzaFactory.createPizza(type);
        /** 变更的代码段 end */
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
