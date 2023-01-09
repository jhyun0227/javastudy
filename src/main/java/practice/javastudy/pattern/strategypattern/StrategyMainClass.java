package practice.javastudy.pattern.strategypattern;

public class StrategyMainClass {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item a = new Item("a", 1000);
        Item b = new Item("b", 2000);

        shoppingCart.addItem(a);
        shoppingCart.addItem(b);

        shoppingCart.pay(new KAKAOCardStrategy("aaa", "1234567890", "123", "01/09"));
        shoppingCart.pay(new LUNACardStrategy("aaa@aaa.com", "12345"));
    }
}
