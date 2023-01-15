package practice.javastudy.ch12.threadStatus;

/**
 * 타켓 스레드의 상태를 출력하는 스레드
 */
public class StatePrintThread extends Thread {

    private Thread targetThread;

    public StatePrintThread(Thread targetThread) {
        this.targetThread = targetThread;
    }

    @Override
    public void run() {
        while (true) {
            Thread.State state = targetThread.getState();
            System.out.println("타켓 스레드의 상태: " + state);

            if (state == Thread.State.NEW) {
                targetThread.start();
            }

            if (state == State.TERMINATED) {
                break;
            }

            try {
                //0.5초간 일시 정지
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
