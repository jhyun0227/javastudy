package practice.javastudy.ch14.classMemberAndLocal;

public class UsingThis {

    public int outterField = 10;

    class Inner {
        int innerField = 20;

        void method() {

            MyFunctionalInterface fi = () -> {
                int rambdaField;

                System.out.println("outterField: " + outterField);
                System.out.println("outterField: " + UsingThis.this.outterField); //바깥의 객체를 참조를 얻기 위해선 클래스명.this

                System.out.println("innerField = " + innerField);
                System.out.println("innerField = " + this.innerField); //람다식 내부에서 this는 Inner객체 참조

               //System.out.println("rambdaField: " + this.);
            };

            fi.method();
        }
    }
}
