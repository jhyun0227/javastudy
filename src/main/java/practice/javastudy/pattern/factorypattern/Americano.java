package practice.javastudy.pattern.factorypattern;

public class Americano extends Coffee {

    public Americano(int price) {
        super.price = price;
    }

    public int getPrice() {
        return price;
    }
}
