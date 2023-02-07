package practice.javastudy.ch13.genericMethod;

public class CompareMethodExample {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "사과");
        Pair<Integer, String> p2 = new Pair<>(1, "사과");

        boolean compare1 = Util.<Integer, String>compare(p1, p2);
        if (compare1) {
            System.out.println("논리적으로 동등");
        } else {
            System.out.println("논리적으로 동등하지 않음");
        }

        Pair<String, String> p3 = new Pair<>("user1", "홍길동");
        Pair<String, String> p4 = new Pair<>("user2", "홍길동");

        boolean compare2 = Util.compare(p3, p4);
        if (compare2) {
            System.out.println("논리적으로 동등");
        } else {
            System.out.println("논리적으로 동등하지 않음");
        }

    }
}
