package Composition;

public class Main {


    public static void main(String[] args) {
        Dimensions dimensions=new Dimensions(20,20,5);
        Case theCase=new Case("220B","Dell","240",dimensions);
        Monitor theMonitor=new Monitor("27Inch Beast","Dell",27,new Resolution(2540,1440));
        Motherboard theMotherBoard=new Motherboard("BJ-200","Asus",4,6,"v2.44");
        PC thePC=new PC(theCase,theMonitor,theMotherBoard);
        thePC.powerUp();


        //Create a single room of a house using composition.
        //Think about the things that should be included in the room.
        //Maybe physical parts of the house but furniture as well
        //Add at least one method to access an object via a getter and
        //then that object public method to hide the object e.g. not using a getter
        //but to access the object used in composition within the main class


    }
}
