You are tasked with creating a Java program that simulates a bank account management system using object-oriented principles. The program should allow users to perform basic operations such as depositing, withdrawing, and checking their account balance. Additionally, the program should provide motivational messages based on the user's account balance milestones.

**Instructions:**

1. **BankAccount Class Implementation:**
   - Implement a `BankAccount` class with the following specifications:
     - Private fields: `username` (String) and `balance` (double).
     - Constructor: Accepts `username` and `initialBalance` (double). Ensure `initialBalance` is non-negative; if negative, display an error message.
     - Method: `greetings()`: Prints a greeting message using the `username`.
     - Method: `getBalance()`: Returns the current account balance.
     - Method: `deposit(double amount)`: Deposits `amount` into the account if `amount` is positive; otherwise, displays an error message.
     - Method: `withdraw(double amount)`: Withdraws `amount` from the account if sufficient funds are available; otherwise, displays an error message.
     - Method: `message()`: Prints a motivational message based on the account balance milestones (e.g., reaching $50k or $100k).

2. **Main Class Implementation:**
   - In the `Main` class:
     - Create an instance of `BankAccount` with a username of your choice and an initial balance of $25,000.
     - Display the initial balance and perform the following operations:
       - Deposit $30,000 into the account.
       - Display the updated balance after each deposit.
       - Withdraw $5,000 from the account.
       - Display the updated balance after the withdrawal.
       - Deposit an additional $50,000 into the account.
       - Display the final balance after the deposit and print the motivational message based on the final balance milestone.

3. **Requirements:**
   - Ensure the program demonstrates the use of constructors, instance methods, conditionals, and method calls.
   - The `message()` method should provide different motivational messages based on the account balance milestones ($50k and $100k).
   - Handle edge cases such as negative initial balances and invalid transactions gracefully by displaying appropriate error messages.

**Example Output:**

Your program should produce output similar to the following when run:

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
