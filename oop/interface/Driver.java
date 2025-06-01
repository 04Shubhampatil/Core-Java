


public class Driver {
    public static void main(String[] args) {

    }
}
interface Atm {

    public abstract boolean debit(double amount);

    public abstract void credit(double amount);

    public abstract void printSlip();

    public abstract boolean changPin(int oldpin, int newPin);

    public abstract double checkBalance();

    public abstract void fundTransfer(Atm atm, double amount);

}

abstract class Account implements Atm {
    protected double balance;
    protected int pin;
    protected String accNo;
    protected String custName;

    Account(){

    }

    Account(double balance, int pin, String accNo, String Name) {
        this.balance = balance;
        this.pin = pin;
        this.accNo = accNo;
        this.custName = custName;

    }

    public void printSlip() {
        System.out.println("Name:" + custName + "\n" + "balance:" + balance);
    }

    public boolean changPin(int oldpin, int newPin) {
        if (this.pin == oldpin) {
            this.pin = newPin;
            System.out.println("pin has been change succefully ");
            return true;
        }
        System.out.println("old pin is invalid");
        return false;
    }

    public double checkBalance() {
        return this.balance;
    }

    public void credit(double amount){
        this.balance += amount;
        System.out.println("Your updated balance = " + checkBalance());
    }

}

class SavingAccount extends Account {
    // !private method
    double intr_rate;

    SavingAccount(double balance, int pin, String accNo, String Name, double intr_rate) {
        super(balance, pin, accNo, Name);
        // TODO Auto-generated constructor stub
        this.intr_rate = intr_rate;
    }

    @Override
    public boolean debit(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            this.balance -= 5;
            System.out.println("Debit has been succefull");
            return true;
        } else {
            System.out.println("Insufficient balance ");
        }
        System.out.println("your remaing balance = " + checkBalance());
        return false;

    }

    // @Override
    // public void credit(double amount) {
    // }

    @Override
    public void fundTransfer(Atm atm, double amount) {
       SavingAccount sa = (SavingAccount)atm;
       this.debit(amount);
    }

}

class currentAccount extends Account {
    currentAccount(double balance, int pin, String accNo, String Name) {
        super(balance, pin, accNo, Name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean debit(double amount) {
       {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Debit has been succefull");
                        return true;

        } else {
            System.out.println("Insufficient balance ");
        }
        System.out.println("your remaing balance = " + checkBalance());
return false;
    }

    }

    @Override
    public void credit(double amount) {
        // TODO Auto-generated method stub
    }

    @Override
    public void fundTransfer(Atm atm, double amount) {
        // TODO Auto-generated method stub
    }

}

class ChequeAccount extends Account {
    ChequeAccount(double balance, int pin, String accNo, String Name) {
        super(balance, pin, accNo, Name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean debit(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            this.balance -= 10;
            System.out.println("Debit has been succefull");
            return true;
        } else {
            System.out.println("Insufficient balance ");
        }
        System.out.println("your remaing balance = " + checkBalance());
        return false;

    }

    

    @Override
    public void credit(double amount) {
        // TODO Auto-generated method stub
    }

    @Override
    public void fundTransfer(Atm atm, double amount) {
        // TODO Auto-generated method stub
    }

}

