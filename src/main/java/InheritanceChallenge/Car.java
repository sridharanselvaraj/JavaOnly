package InheritanceChallenge;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int curretGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.curretGear = 1;
    }

    public void changeGear(int curretGear) {
        this.curretGear = curretGear;
        System.out.println("Car.setCurrentGear(): Changed to "+this.curretGear +" gear.");
    }

    public void changeVelocity(int speed,int direction)
    {
        move(speed,direction);
        System.out.println("Car.changeVelocity() : Velocity "+speed+ " direction "+direction);
    }

}
