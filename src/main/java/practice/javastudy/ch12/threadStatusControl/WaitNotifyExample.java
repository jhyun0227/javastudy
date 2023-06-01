package practice.javastudy.ch12.threadStatusControl;

public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();

        WorkObjectThreadA workObjectThreadA = new WorkObjectThreadA(sharedObject);
        WorkObjectThreadB workObjectThreadB = new WorkObjectThreadB(sharedObject);

        workObjectThreadA.start();
        workObjectThreadB.start();
    }
}
