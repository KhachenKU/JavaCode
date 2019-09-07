package Animal;
import Comparator.Comparable;

public class Animal implements Comparable{
    private int age;
    private String name;

    public Animal(String name, int age){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Object other){
        if(this.getAge() < ((Animal)other).getAge())
            return -1;
        else if(this.getAge() == ((Animal)other).getAge())
            return 0;
        return 1;
    }
}
