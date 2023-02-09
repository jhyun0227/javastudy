package practice.javastudy.ch14.functionalInterface;

public class MyFunctionalInterfaceExample2 {
    public static void main(String[] args) {
        MyFunctionalInterface2 fi;

        fi = (x) -> {
            int result = x + 5;
            System.out.println("result = " + result);
        };
        fi.method(2);

        fi = (x) -> {
            System.out.println(x * 5);
        };

        fi.method(2);


        //매개변수가 하나일 경우에는 괄호를 생략 가능하다.
        fi = x -> System.out.println(x * 5);
        fi.method(2);
    }
}
