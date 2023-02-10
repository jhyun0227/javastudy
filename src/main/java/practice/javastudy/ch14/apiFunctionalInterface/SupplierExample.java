package practice.javastudy.ch14.apiFunctionalInterface;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
    /**
     * Supplier 함수적 인터페이스는 매개값은 없지만 return값은 존재한다.
     */
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            return "Supplier";
        };
        String str = supplier.get();
        System.out.println("str = " + str);

        IntSupplier intSupplier = () -> {
            int num = (int) (Math.random() * 6) + 1;
            return num;
        };

        int num = intSupplier.getAsInt();
        System.out.println("눈의 수: " + num);

    }
}
