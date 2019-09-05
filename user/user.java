package user;

public class user {
    // encapsulate
    private int ID;
    private String password;
    private int amount;

    // constructor
    public user(int ID, String password) {
        this.ID = ID;
        this.password = password;
        this.amount = 0;
    }

    // method
    public void deposit() {
        this.amount = this.amount + 1;
    }
    public void withdraw() {
        this.amount--;
    }

    // getter, setter
    public int getID() {
        return ID;
    }
    public int getAmount() {
        return amount;
    }
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
}