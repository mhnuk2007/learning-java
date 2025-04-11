package ControlStructures;

public class CountDown {
    public static void main(String[] args) {
        int start = 10;

        while (start > 0) {
            System.out.println("Countdown: " + start);
            start--;
        }
        System.out.println("Liftoff!");
    }
}
