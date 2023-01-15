package practice.javastudy.ch12.beepPrintEx;

import java.awt.*;

/**
 * 메인 스레드와 작업 스레드 둘다 이용
 */
public class BeepPrintExample2 {
    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }

        //Runnable 익명객체로 생성
        /*
        Thread thread1 = new Thread(new Runnable() {
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
        });
        */

        //람다식 이용
        /*
        Thread thread1 = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();

            for (int i = 0; i < 5; i++) {
                toolkit.beep();

                try {
                    Thread.sleep(500);
                } catch (Exception e) {

                }
            }
        });
        */
    }
}
