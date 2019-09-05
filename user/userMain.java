package user;

public class userMain {
    public static void main(String[] arg) {
        user Frong = new user(0, "1q2w3e4r");
        user Iaun = new user(1, "qaz12312511");

        System.out.println(Frong.getID() + ": " + Frong.getAmount());
        Frong.deposit();
        System.out.println(Frong.getID() + ": " + Frong.getAmount());
        Frong.withdraw();
        System.out.println(Frong.getID() + ": " + Frong.getAmount());
    }
}
