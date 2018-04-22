package Inheritance;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Dobor", 8, 20, 2, 19, 2, 1, 20, "long slicky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
