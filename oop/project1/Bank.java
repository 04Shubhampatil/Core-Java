package project1;

class BankAccount {
    public String customerName;
    private int accountNumber;
    private double balance;
    public int pin;

    BankAccount() {
        System.out.println("BankAccount object is created");
    }

    // Parameterized constructor
    public BankAccount(String customerName, int accountNumber, double balance, int pin) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    // Method to print account details
    public void printDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("PIN: " + pin);
        System.out.println("Credit and debit are successfully works");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("Amit Patel", 20588101, 20000, 425113);

        System.out.println("Details of Account 1:");
        obj1.printDetails();
        System.out.println();
    }
}
