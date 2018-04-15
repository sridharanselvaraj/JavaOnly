
public class Operators {

    public static void main(String ar[])
    {

        int i =1+2;
        System.out.printf("1 + 2 ="+ i);

        int previousResult=i;

        i=i-1;
        System.out.println(previousResult+"-1 ="+ i);

        previousResult=i;
        i=i+1;
        System.out.println("Result is now "+i);
        i++;
        System.out.println("Result is now "+i);
        i--;
        System.out.println("Result is now "+i);
        i +=2;
        System.out.println("Result is now "+i);
        i *=10;
        System.out.println("Result is now "+i);
        i /=10;
        System.out.println("Result is now "+i);

        boolean isAlien=false;
        if(isAlien==true)
            System.out.println("It is not an alient!");
        else
            System.out.println("It is an alient!");

        int topScore=80;
        if(topScore <= 100)
            System.out.println("You got the high score!");

        int secondTopScore =81;
        if((topScore > secondTopScore) && (topScore < 100))  //And Operator
            System.out.println("Greater than top score and less then 100");

        if((topScore > 90)|| (secondTopScore <=90)) //OR Operator
            System.out.println("One of these tests is true");

        int newValue=50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar =false;
        if(isCar = true)
            System.out.println("This is not supposed to happen");

        isCar =true;
        boolean wasCar=isCar? true : false;
        if(wasCar)
        System.out.println("wasCar is true");

        double value=20d;
        double secondValue = 80;

        double resultOfDouble=value+secondValue;

        double resultOfSecoud = (value+resultOfDouble) *25;
        System.out.println("Result "+resultOfSecoud);

        double myRemainder = resultOfSecoud % 40;

        if (myRemainder <=20)
            System.out.println("Total was over the limit");
        
    }

}
