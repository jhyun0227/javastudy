package practice.javastudy.ch12.threadStatusControl;

public class ConsumerThread extends Thread {

    private DataBox dataBox;

    public ConsumerThread(DataBox dataBox) {
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            String data = dataBox.getData();
        }
    }
}
