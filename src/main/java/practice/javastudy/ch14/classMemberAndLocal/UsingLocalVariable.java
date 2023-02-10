package practice.javastudy.ch14.classMemberAndLocal;

public class UsingLocalVariable {
    public void method(int arg) {
        int localVal = 40;

        //매개변수, 로컬변수는 람다식에서 읽는 것은 허용하지만 쓰는것은 허용하지 않는다.
        //arg = 31;
        //localVal = 41;

        //람다식
        MyFunctionalInterface fi = () -> {
            //로컬 변수 읽기
            System.out.println("arg = " + arg);
            System.out.println("localVal = " + localVal);
        };

        fi.method();
    }
}
