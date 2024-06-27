public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Elsie", 25000);
        myAccount.greetings();

        // Check initial balance
        System.out.println("Your balance is $" + myAccount.getBalance());

        // Deposit $30k
        myAccount.deposit(30000);
        System.out.println("Your balance is $" + myAccount.getBalance());
        myAccount.message();

        // Withdraw $5k
        myAccount.withdraw(5000);
        System.out.println("Your balance is $" + myAccount.getBalance());

        // Deposit $50k
        myAccount.deposit(50000);
        System.out.println("Your balance is $" + myAccount.getBalance());
        myAccount.message();
    }
}