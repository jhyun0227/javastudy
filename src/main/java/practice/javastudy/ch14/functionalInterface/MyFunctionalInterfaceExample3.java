package practice.javastudy.ch14.functionalInterface;

public class MyFunctionalInterfaceExample3 {
    public static void main(String[] args) {
        MyFunctionalInterface3 fi;

        fi = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> {
            return x + y;
        };
        System.out.println(fi.method(2, 5));

        //중괄호 {}에 return문만 존재하고, 뒤에 연산식이나 메소드 호출이 오는 경우 다음 2가지 방법으로 메소드를 작성할 수 있다.
        fi = (x, y) -> x + y;
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> sum(x, y);
        System.out.println(fi.method(2, 5));
    }

    public static int sum(int x, int y) {
        return (x + y);
    }
}
