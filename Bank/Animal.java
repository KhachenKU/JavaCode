public class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }
    public void sleep() {
        System.out.println(name + " is sleeping... ");
    }
    public void makeNoise() {
        System.out.println(name + " is making noise... ");
    }
}

