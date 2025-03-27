

class BankAccount {
    private String customerName;
    private String accountNumber;
    private double balance;
    private int pin;

    // Constructor
    public BankAccount(String customerName, String accountNumber, double balance, int pin) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    // Method to deposit money (credit)
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount credited successfully. New Balance: " + balance);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    // Method to print account details
    public void printDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("pin: " + pin);

    }
}

public class Bank {

    public static void main(String[] args) {
        // Creating a bank account object
        BankAccount account1 = new BankAccount("John Doe", "123456789", 5000.0, 1234);
        // Printing initial details
        account1.printDetails();

        // Crediting money
        account1.credit(1500.0);

        // Printing updated details
        account1.printDetails();
    }
}
