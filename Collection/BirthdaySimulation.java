package Collection;

import java.util.random.RandomGenerator;

public class BirthdaySimulation {

    // Static method to find how many people are needed to cover all 366 birthdays
    public static int neverEndingBirthdayParty() {
        RandomGenerator rgen = RandomGenerator.getDefault(); // getInstance() can be replaced with getDefault()

        boolean[] used = new boolean[366];
        int numLeft = 366;
        int numPeople = 0;

        while (numLeft > 0) {
            int birthday = rgen.nextInt(0, 366); // ✅ includes 365
            if (!used[birthday]) {
                used[birthday] = true;
                numLeft--;
            }
            numPeople++;
        }

        return numPeople;
    }

    // Example usage
    public static void main(String[] args) {
        int result = neverEndingBirthdayParty();
        System.out.println("Number of people needed: " + result);
    }
}
