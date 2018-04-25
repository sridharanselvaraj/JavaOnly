package PolymorphismChallenge;


class Car
{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    private String brake;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine()
    {
        return  "Car -> startEngine()";
    }

    public String accelerate()
    {
        return "Car -> accelerate()";
    }
    public String brake()
    {
        return "Car -> brake()";
    }

}

class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return  getClass().getSimpleName()+"-> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+"-> accelarate()";
    }

    @Override
    public String brake()
    {
        return getClass().getSimpleName()+"-> brake()";
    }

}
 class Molden extends Car {

    public Molden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+"-> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+"-> accelarate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+"-> brake()";
    }

}
 class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+ "-> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+ "-> accelarate()";
    }

    @Override
    public String brake()
    {
        return getClass().getSimpleName()+"-> brake()";
    }

}

public class Main {

    public static void main(String[] args) {

        //We are going to go back to the car analogy.
        //Create a base class called Car
        //It should have a few fields that would be appropriate for a generic car class.
        //engine, cylinder,wheels, etc.
        //Constrictor should initialize cylinders(number of) and name, and set wheels to 4
        //and engine to true. Cylinders and names would be passed parameters.
        //Create appropriate getters
        //Create some method like startEngine, accelerate, and brake
        //show a message for each in the base class
        //Now create 3 sub classes for your favorite vehicle.
        //Override the appropriate methods to demonstrate polymorphism in use.
        //put all classes in the one java file(this one).

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Ownlander 400");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford focus");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Molden molden = new Molden(6, "Molden Macra");
        System.out.println(molden.startEngine());
        System.out.println(molden.accelerate());
        System.out.println(molden.brake());
    }




}
