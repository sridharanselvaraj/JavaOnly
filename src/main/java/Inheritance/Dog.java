package Inheritance;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight,int eyes,int tails,int teeth,String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.tail=tails;
        this.coat=coat;
        this.teeth=teeth;
        this.legs=legs;

    }
    private void chew()
    {
        System.out.println("Dog.chew() Called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    public void walk()
    {
        System.out.println("Dog Walk() called");
        super.move(12);
    }
    public void run()
    {
        System.out.println("Dog Run() called");
        move(24);
    }

    private void moveLegs(int speed)
    {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
