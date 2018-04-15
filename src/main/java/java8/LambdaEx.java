package java8;

public class LambdaEx {
    public static void main(String[] args) {

       //  MyNumber myNumber;

        MyNumber isEven=(n)-> (n*2) ==0;

        if(!isEven.test(9)) System.out.println("9 is not Even");
        if(!isEven.test(10)) System.out.println("10 is  Even");

        MyNumber isNonNeg=(n) -> n >=0;
        if(isNonNeg.test(1)) System.out.println("1 is non-negative");
        if(!isNonNeg.test(-1)) System.out.println("-1 is Negative");
//        //myNumber=()->124.23;
//
//        System.out.println("A fixed value :"+myNumber.getValue());
//
//       // myNumber=() -> Math.random()*100;
//
//        System.out.println("A Random value :"+myNumber.getValue());
//        System.out.println("A Second Random value :"+myNumber.getValue());
    }
}
