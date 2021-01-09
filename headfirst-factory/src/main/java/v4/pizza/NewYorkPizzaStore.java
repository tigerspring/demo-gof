package v4.pizza;

public class NewYorkPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        return new NewYorkStylePizza(type);
    }
}
