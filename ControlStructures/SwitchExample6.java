package ControlStructures;
// switch with enum
public class SwitchExample6 {
    enum Day { MON, TUE, WED }

    public static void main(String[] args) {
        Day today = Day.WED;

        switch (today) {
            case MON: System.out.println("Start of week"); break;
            case TUE: System.out.println("Second day"); break;
            case WED: System.out.println("Midweek"); break;
        }
    }
}
// Output: Midweek
