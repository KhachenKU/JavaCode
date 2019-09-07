package Bank;

import Comparator.Data;

public class BankApp {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(5,1000);
        BankAccount b2 = new BankAccount(4,2000);
        BankAccount b3 = new BankAccount(9,100);
        BankAccount b4 = new BankAccount(11,100.99);
        BankAccount b5 = new BankAccount(59,50);

        BankAccount[] Accounts = {b1,b2,b3,b4,b5};
        Data.sort(Accounts);

        for(BankAccount b: Accounts){
            System.out.println(b.getAccountId() + ":" + b.getBalance());
        }
    }
}
