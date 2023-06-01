package practice.javastudy.ch12.threadStatus;

public class TargetThread extends Thread {
    @Override
    public void run() {
        for (long i = 0; i < 2000000000; i++) {
            if (i == 1000000000) {
                System.out.println("===");
            }
        }

        try {
            //1.5초간 일시정지
            Thread.sleep(1500);
        } catch (Exception e) {}

        for (long i = 0; i < 2000000000; i++) {
            if (i == 1000000000) {
                System.out.println("===");
            }
        }
    }
}
