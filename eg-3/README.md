# Bank Account Management System

This Java program simulates a basic bank account management system using object-oriented programming principles. It allows users to perform operations such as depositing, withdrawing, and checking their account balance. Additionally, motivational messages are provided based on specific account balance milestones.

## Classes

### BankAccount

The `BankAccount` class represents a bank account with the following features:

- **Fields**:
  - `username` (String): Stores the username associated with the account.
  - `balance` (double): Stores the current balance of the account.

- **Constructor**:
  - `BankAccount(String username, double initialBalance)`: Initializes the `username` and `balance` fields. Ensures `initialBalance` is non-negative; otherwise, displays an error message.

- **Methods**:
  - `void greetings()`: Prints a greeting message using the `username`.
  - `double getBalance()`: Returns the current account balance.
  - `void deposit(double amount)`: Deposits `amount` into the account if `amount` is positive; otherwise, displays an error message.
  - `void withdraw(double amount)`: Withdraws `amount` from the account if sufficient funds are available; otherwise, displays an error message.
  - `void message()`: Prints a motivational message based on the account balance milestones ($50k and $100k).

### Main

The `Main` class contains the `main` method to demonstrate the functionality of the `BankAccount` class:

- Creates an instance of `BankAccount` with a predefined username and initial balance.
- Performs operations such as depositing, withdrawing, and displaying the account balance.
- Prints motivational messages based on specific account balance milestones.

## Usage

1. **Clone the Repository**:
   ```
   git clone https://github.com/your-username/bank-account.git
   ```

2. **Compile and Run**:
   ```
   cd bank-account
   javac BankAccount.java Main.java
   java Main
   ```

3. **Expected Output**:

   ```
   Hello, Elsie
   Your balance is $25000.0

   You have deposited $30000.0 into your account.
   Your balance is $55000.0
   Congratulations on reaching $50k and more! You're more than halfway to your $100k goal, and this is a fantastic achievement.
   Keep pushing forward with the same determination and dedication. We're here to support you every step of the way.

   You have withdrawn $5000.0 from your account.
   Your balance is $50000.0

   You have deposited $50000.0 into your account.
   Your balance is $100000.0
   Congratulations Elsie! You have successfully made it to your first $100k milestone. We're truly excited for you.
   To help you grow your wealth further, we have some great investment opportunities for you that you might be interested in.
   Kindly click on the confirmation button if you would like to see more. Enjoy your achievement!
   ```
