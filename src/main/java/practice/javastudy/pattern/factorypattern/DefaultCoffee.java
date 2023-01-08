package practice.javastudy.pattern.factorypattern;

public class DefaultCoffee extends Coffee {

    public DefaultCoffee() {
        super.price = -1;
    }

    public int getPrice() {
        return price;
    }
}
