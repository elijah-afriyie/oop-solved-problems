public class BankAccount { // Notice how this wasn't declared as an abstract class because we aren't going to create instances of this class.
    // Fields
    private String username;
    private double balance;

    // Constructor
    public BankAccount(String username, double initialBalance) {
        this.username = username;
        if (initialBalance >= 0 ) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial Balance can't be negative");
        }
    }

    // Greetings
    public void greetings() {
        System.out.println("Hello, " + username);
    }

    // Check account balance
    public double getBalance() {
        return balance;
    }

    // Deposit into account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You have deposited $" + amount + " into your account.");
        } else {
            System.out.println("Transaction not successful. Enter a valid amount");
        }
    }

    // Withdraw from account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("You have withdrawn $" + amount + " from your account.");
            } else {
                System.out.println("You do not have enough funds to complete this transaction.");
            }
        } else {
            System.out.println("Transaction not successful. Enter a valid amount");
        }
    }

    // Motivational Message
    public void message() {
        if (balance >= 100000) {
            System.out.println("Congratulations " + username + "! You have successfully made it to your first $100k milestone. We're truly excited for you. To help you grow your wealth further, we have some great investment opportunites for you that you might be interested in. Kindly click on the confirmation button if you would like to see more. Enjoy your achievement!");
        } else if (balance > 50000) {
            System.out.println("Congratulations on reaching $50k and more! You're more than halfway to your $100k goal, and this is a fantastic achievement.");
            System.out.println("Keep pushing forward with the same determination and dedication. We're here to support you every step of the way.");
        } else if (balance == 50000) {
            System.out.println("Congratulations on reaching $50k! You're halfway to your $100k goal, and this is a fantastic achievement.");
            System.out.println("Keep pushing forward with the same determination and dedication. We're here to support you every step of the way.");
        } else if (balance < 50000) {
            System.out.println("Congratulations on reaching $50k! You're halfway to your $100k goal, and this is a fantastic achievement.");
            System.out.println("Keep pushing forward with the same determination and dedication. We're here to support you every step of the way.");
        }
    }
        
}
