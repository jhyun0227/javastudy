package practice.javastudy.pattern.factorypattern;

public class mainClass {
    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.getCoffee("Latte", 5000);
        Coffee americano = CoffeeFactory.getCoffee("Americano", 4000);
        System.out.println("latte = " + latte.toString());
        System.out.println("americano = " + americano.toString());
    }
}
