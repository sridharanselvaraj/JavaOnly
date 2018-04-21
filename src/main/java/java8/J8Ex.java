package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class J8Ex {

    public static void main(String[] args) {

        List<People> person= Arrays.asList(new People("Sri","1232","London"),
                new People("Lex","12642","London"),
                new People("Veli","1332","USA"),
                new People("Srinithi","1732","France"),
                new People("Alex","1292","Spain")
                );

        Collections.sort(person,(p1,p2)->p1.getEname().compareTo(p2.getEname()));

        System.out.println("Print All Person ");
        printContionallly(person,p->true);

        System.out.println("Print All Start with Name - S");
        printContionallly(person,p->p.Ename.startsWith("S"));

        System.out.println("Print All End with Name - i");
        printContionallly(person,p->p.Ename.endsWith("i"));

    }

    private static void printContionallly(List<People> person,Predicate<People> condition) {

            for(People p:person)
            {
                if(condition.test(p))
                {
                    System.out.println(p);
                }
            }
    }

}

