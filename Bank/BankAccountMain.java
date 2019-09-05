public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount k1 = new BankAccount("Kate");
        BankAccount k2 = new BankAccount("Kate");
//        kate.deposit(1000);
//        kwan.withdraw(200);
//        System.out.println(kate.getName() + " has: " + kate.getBalance());
//        System.out.println(kwan.getName() + " has: " + kwan.getBalance());
//
//        System.out.println(kate.toString());
//        System.out.println(kwan.toString());

        if (k1 == k2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (k1.equals(k2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}