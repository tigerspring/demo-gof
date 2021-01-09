package v4.pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        return new ChicagoStylePizza(type);
    }
}
