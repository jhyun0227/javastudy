package practice.javastudy.ch12.threadStatusControl;

public class ProducerThread extends Thread {

    private DataBox dataBox;

    public ProducerThread(DataBox dataBox) {
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            String data = "Data-" + i;
            dataBox.setData(data);
        }
    }
}
