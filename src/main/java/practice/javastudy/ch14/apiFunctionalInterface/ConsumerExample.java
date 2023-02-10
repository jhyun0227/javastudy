package practice.javastudy.ch14.apiFunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
    /**
     * Consumer 함수적 인터페이스는 매개값은 있지만 return값은 없다.
     */
    public static void main(String[] args) {
        Consumer<String> consumer = (t) -> {
            System.out.println(t);
        };
        consumer.accept("Java");

        BiConsumer<String, String> biConsumer = (t, u) -> {
            System.out.println(t + u);
        };
        biConsumer.accept("Java", "8");

        DoubleConsumer doubleConsumer = (d) -> {
            System.out.println("Java" + d);
        };
        doubleConsumer.accept(8.0);

        ObjIntConsumer<String> objIntConsumer = (t, i) -> {
            System.out.println(t + i);
        };
        objIntConsumer.accept("java", 8);

    }
}
