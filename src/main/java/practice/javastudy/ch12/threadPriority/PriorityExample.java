package practice.javastudy.ch12.threadPriority;

/**
 * 2억번의 루프가 끝나는 순서대로 스레드의 이름을 출력
 */
public class PriorityExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            CalcThread thread = new CalcThread("thread" + i);

            if (i != 10) {
                thread.setPriority(Thread.MIN_PRIORITY);
            } else {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }
    }
}
