import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {


    public static void main(String[] args) {

        int x=getIntEAPF();
        System.out.println("X is "+x);

    }

    private static int getInt()
    {
        Scanner s=new Scanner(System.in);
        return s.nextInt();
    }

    private static int getIntLBYL()
    {
        Scanner s=new Scanner(System.in);
        boolean isValid=true;
        System.out.println("Please enter an integer");
        String input=s.next();
        for (int i =0;i<input.length();i++)
        {
            if(!Character.isDigit(input.charAt(i)))
            {
                isValid=false;
                break;
            }
        }
        if(isValid)
        {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAPF()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter an integer");
        try {
            return s.nextInt();
        }catch (InputMismatchException e)
        {
            return 0;
        }
    }

    public static int dividedEAFP(int x,int y)
    {
        try
        {
            return x/y;
        }catch (ArithmeticException e)
        {
            return 0;
        }
    }



}
