package practice.javastudy.ch12.beepPrintEx;

import java.awt.*;

/**
 * Thread로 부터 작업 스레드 객체를 직접 생성하려면 Runnable을 상속한 객체가 있어야한다.
 * 익명 객체나 람다식으로 해도 된다.
 */
public class BeepTask implements Runnable {

    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();

            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
