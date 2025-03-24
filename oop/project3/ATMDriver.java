
public class ATMDriver {

    public static void main(String[] args) {
        
    }
}

interface ATM {

    public abstract boolean debit(double amount);

    public abstract void credit(double amount);

    public abstract void printSlip();

    public abstract boolean changePin(int oldPin, int newPin);

    public abstract double checkBalance();

    public abstract void fundTransfer(ATM atm, double amount);
}

abstract class Account implements ATM {

    protected double balance;
    protected int pin;
    protected String accNo;
    protected String custName;

    Account(){

    }

    Account(double balance, int pin, String accNo, String name) {
        this.balance = balance;
        this.pin = pin;
        this.accNo = accNo;
        this.custName = name;
    }

    public void printSlip() {
        System.out.println("Name: " + custName + "\n" + "Balance: " + balance);
    }

    public boolean changePin(int oldPin, int newPin) {
        if (this.pin == oldPin) {
            this.pin = newPin;
            System.out.println("Pin has been changed successfully");
            return true;
        }
        System.out.println("Old pin is invalid");
        return false;
    }

    public double checkBalance() {
        return this.balance;
    }

    public void credit(double amount) {
        this.balance += amount;
        System.out.println("Your updated balance = " + checkBalance());

    }
}

class SavingAccount extends Account {

    double intr_rate;

    SavingAccount(){

    }

    SavingAccount(double balance, int pin, String accNo, String name, double intr_rate) {
        super(balance, pin, accNo, name);
        //TODO Auto-generated constructor stub
        this.intr_rate = intr_rate;
    }

    @Override
    public boolean debit(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            this.balance -= 5;
            System.out.println("Debit has been successful");
            return true;
        } else {
            System.out.println("Insufficient balance");            
        }
        System.out.println("Your remaining balance = " + checkBalance());
        return false;

    }

    @Override
    public void fundTransfer(ATM atm, double amount) {
        SavingAccount sa = (SavingAccount)atm;

        if(this.debit(amount)){
            sa.credit(amount);
            System.out.println("Funds transfer successfully");
        }        

    }

}

class CurrentAccount extends Account {

    CurrentAccount(double balance, int pin, String accNo, String name) {
        super(balance, pin, accNo, name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean debit(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Debit has been successful");
            return true;
        } else {
            System.out.println("Insufficient balance");
        }
        System.out.println("Your remaining balance = " + checkBalance());
        return false;
    }

    @Override
    public void fundTransfer(ATM atm, double amount) {
        CurrentAccount sa = (CurrentAccount)atm;

        if(this.debit(amount)){
            sa.credit(amount);
            System.out.println("Funds transfer successfully");
        }   

    }
}

class ChequeAccount extends Account {

    ChequeAccount(double balance, int pin, String accNo, String name) {
        super(balance, pin, accNo, name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean debit(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            this.balance -= 10;
            System.out.println("Debit has been successful");
            return true;
        } else {
            System.out.println("Insufficient balance");
        }
        System.out.println("Your remaining balance = " + checkBalance());
        return false;

    }

    @Override
    public void fundTransfer(ATM atm, double amount) {
        ChequeAccount sa = (ChequeAccount)atm;

        if(this.debit(amount)){
            sa.credit(amount);
            System.out.println("Funds transfer successfully");
        }   

    }
}
