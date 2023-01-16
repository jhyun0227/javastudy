package practice.javastudy.ch12.threadStatusControl;

/**
 * 다른 스레드의 종료를 기다림 join()
 */
public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            //join 메서드로 인해 메인스레드는 sumThread가 끝날때 까지 잠시 대기 상태로 존재한다.
            sumThread.join();
        } catch (InterruptedException e) {}

        System.out.println("1~100 합: " + sumThread.getSum());
    }
}
