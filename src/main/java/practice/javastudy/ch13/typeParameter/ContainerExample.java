package practice.javastudy.ch13.typeParameter;

public class ContainerExample {
    public static void main(String[] args) {
        /**
         * 타입 파라미터 덕분에 클래스 설계 시 구체적인 타입을 명시하지 않고,
         * 실제 클래스가 사용될 때 구체적인 타입을 지정함으로 타입 변환을 최소회시킨다.
         */
        Container<String> container1 = new Container<>();

        container1.setT("hello");
        String str = container1.getT();

        Container<Apple> container2 = new Container<>();
        //container2.setT("케케케"); //타입이 달라서 안된다.
        container2.setT(new Apple());
        Apple apple = container2.getT();
    }
}
