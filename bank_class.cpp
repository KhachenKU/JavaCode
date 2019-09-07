#include <iostream>
#include <vector>
using namespace std;

// class Bank {
// public:
//     // ----- data member -----
//     vector<BankAccount> accounts;
// };


// ----- Access specifier (access modifier) -----
// access specifier  มี 3 ระดับ
// - private
// - public
// - protected

//--------------------------------
// encapsulation : การปกป้องข้อมูล
//
// abstraction : ซ้อนกลไกที่ซับซ้อนเอาไว้โดยไม่ต้องรู้กลไกของมันโดยสร้าง interface ขึ้นมาปกป้อง Ex. Microwave
class BankAccount {
private:
    // ----- data member -----
    string name;
    int id;
    string address;
    double balance;
public:
    // ----- constructor -----
    BankAccount(string n, int i, string addr, double b){
        name = n;
        id = i;
        address = addr;
        balance = b;
        if(b < 0) balance = 0;
    }

    // ----- member functions -----
    // - acessor : read data member without modifying it (ใส่ const ต่อเพื่อให้รู้ว่าปลอดภัย)
    // - mutator : modify data member
    //
    void addInterrest(double rate) {
        balance  += (balance * rate);
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    // ----- getters / setters -----
    double getBalance() const {
        return balance;
    }
    string getName() const {
        return name;
    }
    int getId() const {
        return id;
    }
    void setName(string newName){
        name = newName;
    }

    // ----- toString() -----
    string ToString() const {
        // string s = name + " has " + to_string(balance);
        // return s;
    }
};

int main(){
    BankAccount kwan("kwam", 1, "Jatujak", 1000);
    BankAccount ploy("ploy", 2, "Laksi", 500);

    kwan.deposit(200);
    ploy.withdraw(100);

    cout << kwan.getName() << " has " << kwan.getBalance() << endl;
    cout << ploy.getName() << " has " << ploy.getBalance() << endl;
}