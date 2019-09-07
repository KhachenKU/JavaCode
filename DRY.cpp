#include <iostream>
using namespace std;

// ===== DRY : Don't Repeat Yourself =====

// ----- Bace class (superclass, parent class) -----
// ----- more general -----
class Animal{
private:
    string name;
    int age;

protected:
    int happiness;

public:
    Animal(string n, int a) : name(n), age(a), happiness(0) {}

    string getName() { return name; }

    int getAge() { return age; }

    void eat(string food) {
        cout << name << " is eating " << food << endl;
    }

    void sleep() {
        cout << name << " is sleeping..." << endl;
    }

    virtual void makeNoise() {
        cout << name << " is making noise" << endl;
    }

};

// ----- derived class (subclass, child class)-----
// ----- more specialized -----
class Dog : public Animal {
public:
    Dog(string n, int a) : Animal(n, a) {}

    // ----- redefine function -----
    void makeNoise() {
        happiness++;
        cout << getName() << " is woofing and happy " << happiness << endl;
    }
};

class Cat : public Animal {
private:
    int furballSize;
public:
    Cat(string n, int a) : Animal(n, a) {}

    // ----- redefine function -----
    void makeNoise() {
        cout << getName() << " is meowing" << endl;
    }

    void makeFurball() {
        cout << getName() << " is making furball ooooo " << endl;
    }
};

class Bird : public Animal {
public:
    Bird(string n, int a) : Animal(n, a) {}

    // ----- redefine function -----
    void makeNoise() {
        cout << getName() << " is chirping" << endl;
    }
};

// if we don't use pointer, this function will be static binding(use function of it type)
void echo(Animal* aniPtr) {
    aniPtr->makeNoise();
    aniPtr->makeNoise();
}

int main(){
    Dog Toob("Toob", 3);
    Cat Maw("Maw", 3);
    Bird Nok("Nok", 1);

    echo(&Toob);
    echo(&Maw);
    echo(&Nok);

    // Toob.eat("Radna");
    // Toob.makeNoise();

    // Maw.eat("Platu");
    // Maw.makeNoise();

    // ----- IS-A relationship -----
    // Dog is an animal
    // Cat is an animal
    // ----- dynamic binding ----- 
    // Animal *aniPtr = &Toob;
    // aniPtr->makeNoise();

    // aniPtr = &Maw;
    // aniPtr->makeNoise();
}