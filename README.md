Bank Account Simulation
Overview

This project is a simple Java program that simulates basic bank account operations using Object-Oriented Programming (OOP) concepts.
It allows users to create a bank account and perform operations like deposit, withdraw, check balance, and view transaction history.

Features

Create a bank account with account number, holder name, and initial balance.

Deposit money into the account.

Withdraw money with balance validation.

View current balance.

Maintain and display a transaction history.

Menu-driven console interface.

Technologies Used

Java (Core Java, OOP Concepts)

VS Code / IntelliJ IDEA (or any Java IDE)

Terminal/Command Prompt for execution

How to Run

Clone the repository:

git clone https://github.com/your-username/BankAccountSimulation.git


Navigate to the project directory:

cd BankAccountSimulation


Compile the Java program:

javac BankAccount.java


Run the program:

java BankAccount

Sample Output
---Bank Account Details---
Enter Your Bank Account Number:
101
Enter Your Account Holder Name:
Abdullah
Enter Your Initial Balance:
2000

---Bank Menu---
1-Deposit
2-Withdraw
3-CheckBalance
4-Transaction History
5-Exit

Key OOP Concepts Applied

Encapsulation: Account details and balance are private, accessible only through methods.

Abstraction: Provides a simple interface for bank operations.

Constructors: Used to initialize account details.

Objects and Classes: BankAccount class acts as a blueprint; objects represent real accounts.

Repository Structure
BankAccountSimulation/
├── BankAccount.java
└── README.md
