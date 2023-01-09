package practice.javastudy.pattern.factorypattern;

public class CoffeeFactory {

    /**
     * CoffeeFactory 클래스에서 라뗴, 아메리카노의 인스턴스의 주입을 결정.
     * LatteFactory, AmericanoFactory 클래스는 따로 있어야 할수도..? 일단 강의에는 이렇게 되어있음.
     */
    public static Coffee getCoffee(String type, int price) {
        if ("Latte".equalsIgnoreCase(type)) {
            return new Latte(price);
        } else if ("Americano".equalsIgnoreCase(type)) {
            return new Americano(price);
        } else {
            return new DefaultCoffee();
        }
    }

}