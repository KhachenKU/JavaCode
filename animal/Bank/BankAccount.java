package Bank;
import Comparator.Comparable;

public class BankAccount implements Comparable{
    private double balance = 0.00;
    private int AccountId;

    public BankAccount(int AccountId, double balance){
        this.balance = balance;
        this.AccountId = AccountId;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public int getAccountId(){
        return AccountId;
    }

    @Override
    public int compareTo(Object other){
        if(this.getAccountId() < ((BankAccount)other).getAccountId())
            return -1;
        else if(this.getAccountId() == ((BankAccount)other).getAccountId())
            return 0;
        return 1;
    }
}
