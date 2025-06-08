package Collection;

public class BankAccount {

    private String id;
    private double balance;
    private int transactions;

    // Constructor initializes account with ID, zero balance, and zero transactions
    public BankAccount(String id) {
        this.id = id;
        this.balance = 0.0;
        this.transactions = 0;
    }

    // Returns the current balance
    public double getBalance() {
        return balance;
    }

    // Returns the account ID
    public String getID() {
        return id;
    }

    // Deposit amount if between 0-500, increment transaction count
    public void deposit(double amount) {
        if (amount > 0 && amount <= 500) {
            balance += amount;
            transactions++;
        }
    }

    // Withdraw amount if enough balance, increment transaction count
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions++;
        }
    }

    // Method to apply transaction fees based on past transactions
    public boolean transactionFee(double feeAmount) {
        // Calculate total fee to be deducted
        double totalFee = 0.0;
        for (int i = 1; i <= transactions; i++) {
            totalFee += feeAmount * i;
        }

        // Check if balance can cover the total fee and leave > 0 balance
        if (balance > totalFee) {
            balance -= totalFee;
            return true;
        } else {
            balance = 0.0;
            return false;
        }
    }
}
