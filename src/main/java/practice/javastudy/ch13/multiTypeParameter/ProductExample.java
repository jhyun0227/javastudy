package practice.javastudy.ch13.multiTypeParameter;

public class ProductExample {
    public static void main(String[] args) {
        /**
         * 멀티 타입 파라미터도 가능하다.
         * 다이아몬드 연산자안에 ,를 이용하여 사용 가능
         */
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("스마트Tv");
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("디젤");
        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
