package Inheritance;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1,1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest()
    {
        System.out.println("Fish.rest() called");
    }
    private void moveMuscles()
    {
        System.out.println("Fist.moveMuscles() called");
    }
    private void moveBackFin()
    {

    }

    private void swim(int speed)
    {
        moveBackFin();
        moveMuscles();
        super.move(speed);
    }

}
