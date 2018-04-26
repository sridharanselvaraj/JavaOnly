package MasterChallenge;

public class Main {

    public static void main(String[] args) {

        Hanburger hanburger=new Hanburger("Basic","Sausage",3.56,"White");
        double price=hanburger.itemizeHamburger();
        hanburger.addHamburgerAddition1("Tomato",0.27);
        hanburger.addHamburgerAddition2("Lettuce",0.75);
        hanburger.addHamburgerAddition3("Cheese",1.13);
        System.out.println("Total Burger price is "+hanburger.itemizeHamburger());

        HealthyBurger healthyBurger=new HealthyBurger("Becon",5.67);
        healthyBurger.addHealthAddtional1("Egg",5.34);
        healthyBurger.addHealthAddtional2("Lettuce",4.32);
        System.out.println("Total HealthyBurger price is "+ healthyBurger.itemizeHamburger());

        DeluxBurger deluxBurger=new DeluxBurger();
        deluxBurger.itemizeHamburger();
        deluxBurger.itemizeHamburger();

    }


}
