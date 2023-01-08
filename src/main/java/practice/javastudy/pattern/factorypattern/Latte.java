package practice.javastudy.pattern.factorypattern;

public class Latte extends Coffee {

    public Latte(int price) {
        super.price = price;
    }

    public int getPrice() {
        return price;
    }
}
