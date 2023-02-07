package practice.javastudy.ch13.boundedTypeParameter;

public class BoundedTypeParameterExample {
    public static void main(String[] args) {
        //int compare = Util.compare("a", "b"); //Number 타입이 아님

        int result1 = Util.compare(10, 20);
        System.out.println("result1 = " + result1);

        int result2 = Util.compare(4.5, 3);
        System.out.println("result2 = " + result2);
    }
}
