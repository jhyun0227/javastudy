package practice.javastudy.ch14.apiFunctionalInterface;

public class RunnableExample {
    public static void main(String[] args) {
        //첫번째 방법
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();

        //두번째 방법
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });

        thread2.start();
    }
}
