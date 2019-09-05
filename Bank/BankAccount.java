public class BankAccount {
    private String name;
    private double balance;
    public BankAccount(String name) {
        this(name, 0);
    }
    public BankAccount(String name, double balance) {
        this.balance = balance;
        this.name = name;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {return name + " has: " + balance;}

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount act = (BankAccount)obj;
            return name.equals(act.name) && balance == act.balance;
        }
        return false;
    }
}