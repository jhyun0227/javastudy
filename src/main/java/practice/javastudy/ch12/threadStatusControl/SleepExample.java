package practice.javastudy.ch12.threadStatusControl;

import java.awt.*;

/**
 * 주어진 시간동안 일시 정지 sleep()
 */
public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 10; i++) {
            toolkit.beep();

            try {
                // 비프음이 3초 간격으로 들린다.
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
        }
    }
}
