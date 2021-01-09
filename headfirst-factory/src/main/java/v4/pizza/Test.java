package v4.pizza;

public class Test {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NewYorkPizzaStore();
        pizzaStore.orderPizza("cheese");

        pizzaStore =  new ChicagoPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
