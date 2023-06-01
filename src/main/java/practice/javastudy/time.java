package practice.javastudy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class time {
    public static void main(String[] args) {
        Date now = new Date();
        long second = now.getTime() / 1000;
        System.out.println("second = " + second);
    }
}
