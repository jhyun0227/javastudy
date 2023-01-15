package practice.javastudy.ch12.beepPrintEx;

/**
 * 메인스레드와 작업스레드 동시 실행
 */
public class BeepPrintExample3 {
    public static void main(String[] args) {
        Thread thread = new BeepThread();
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");

            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
