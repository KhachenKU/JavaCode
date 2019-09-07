#include <iostream>
using namespace std;

// ----- user defined type -----
// ----- object-oriented programming ------
class Rectangle {
public:
    // ----- data member ----- 
    double width;
    double length;

    // ----- member function ----- ==> calculated all function already
    double area() const {
        return width * length;
    }

    double perimeter() const {
        return 2 * (width + length);
    }
    void changeSize(int d){
        width += d;
        length += d;
    }
};

int main(){
    // ----- r1 is an object of type Rectangle -----
    // ----- r2 is an object of type Rectangle -----
    Rectangle r1, r2; 

    cin >> r1.width >> r1.length;
    cin >> r2.width >> r2.length;

    // ----- r1 is implicit parameter of member function area ----- 
    cout << "Area1: " << r1.area() << endl;
    cout << "Area2: " << r2.area() << endl;

    // ----- r1 is implicit parameter of member function area ----- 
    // ----- 10 is explicit parameter -----
    r1.changeSize(10);
}