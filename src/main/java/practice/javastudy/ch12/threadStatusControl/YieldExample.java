package practice.javastudy.ch12.threadStatusControl;

/**
 * 다른 스레드에게 실행 양보 yield()
 */
public class YieldExample {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadB.start();

        //메인 스레드가 3초 후에 threadA의 work 값을 바꾸어 양보 상태로 바꾼다.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
        threadA.work = false;

        //메인 스레드가 3초 후에 threadA의 work 값을 바꾼다.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
        threadA.work = true;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
        threadA.stop = true;
        threadB.stop = true;
    }
}
