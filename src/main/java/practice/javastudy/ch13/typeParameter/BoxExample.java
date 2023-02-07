package practice.javastudy.ch13.typeParameter;

public class BoxExample {
    public static void main(String[] args) {
        /**
         * 타입 파라미터를 지정하지 않는 경우 강제 타입 변환을 이용해야한다.
         * 저장과 읽기에서 타입변환이 빈번할 경우 성능에 문제가 있다.
         */
        Box box = new Box();

        box.setObject("홍길동"); //String -> Object 타입 변환
        String name = (String) box.getObject(); //Object -> String 타입 변환

        box.setObject(new Apple()); //Apple -> Object 타입 변환
        Apple apple = (Apple) box.getObject(); //Object -> Apple 타입변환
    }
}
