package practice.javastudy.ch12.beepPrintEx;

import java.awt.*;

/**
 * 작업 스레드를 Runnable로 하지 않고
 * Thread 클래스의 하위 클래스를 만들어 사용
 */
public class BeepThread extends Thread {
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
