package Arrays;

import java.util.Scanner;

public class Main {


    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        int[] myInteger=getInteger(5);
        for(int i=0;i<myInteger.length;i++)
        {
            System.out.println("Element "+i+", typed values was "+myInteger[i]);
        }

        System.out.println("The average is "+getAverage(myInteger));

    }

    public static int[] getInteger(int number)
    {
        System.out.println("Enter "+number+" integer values.\r");
        int[] value=new int[number];

        for(int i=0;i<value.length;i++)
        {
            value[i]=scanner.nextInt();
        }
        return value;
    }

    public static double getAverage(int[] array)
    {
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }

        return (double) sum/(double) array.length;
    }

}
