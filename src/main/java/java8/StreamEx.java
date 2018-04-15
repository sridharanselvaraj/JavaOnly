package java8;


import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args) throws IOException {

        String[] names={"A1","Sridharan","Kumar","Selvaraj","Srinivas","Nitin","Srinithi"};
        Arrays.stream(names)
              .filter(x->x.startsWith("S"))
              .sorted()
              .forEach(System.out::println);

        //6, Avarage of integer
        Arrays.stream(new int[]{2,5,6,2,1,7,8,10})
              .map(x->x*x)
                .average()
                .ifPresent(System.out::println);

        //7, Stream from List,filter and print
        List<String> people=Arrays.asList("All","Sridharan","Kumar","Selvaraj","Srinivas","Nitin","Srinithi");
        people.stream()
                .map(String::toLowerCase)
                .filter(x->x.startsWith("a"))
                .forEach(System.out::println);

        //8, Stream rows from text file,sort,filter,and print
        Stream<String> bands= Files.lines(Paths.get("src/main/resources/bands.txt"));
        bands.sorted()
                .filter(x->x.length()>15)
                .forEach(System.out::println);
        bands.close();

        //9, Stream rows from text file and save to List
        List<String> bands2=Files.lines(Paths.get("src/main/resources/bands.txt"))
                .filter(x->x.contains("Pep"))
                .collect(Collectors.toList());
        bands2.forEach(x-> System.out.println(x));

        //10, Stream rows from CSV file and count
        Stream<String> rows1=Files.lines(Paths.get("src/main/resources/data.csv"));
        int rowCount =(int) rows1
                .map(x->x.split(","))
                .filter(x->x.length==3)
                .count();
        System.out.println(rowCount+" rows.");
                rows1.close();

        //11, Stream rows from CSV file, parse data from rows
        Stream<String> rows2=Files.lines(Paths.get("src/main/resources/data.csv"));
        rows2
                .map(x->x.split(","))
                .filter(x->x.length==3)
                .filter(x->Integer.parseInt(x[1])>15)
                .forEach(x-> System.out.println(x[0]+" "+x[1]+" "+x[2]));
        rows2.close();

        //12, Stream rows from CSV file, store fields in HashMap
        Stream<String> rows3=Files.lines(Paths.get("src/main/resources/data.csv"));
        Map<String,Integer> map=new HashMap<>();
        map=rows3.
                map(x->x.split(","))
                .filter(x->x.length==3)
                .filter(x->Integer.parseInt(x[1])>15)
                .collect(Collectors.toMap(
                        x->x[0],x->Integer.parseInt(x[1])
                ));
         rows3.close();
         for(String key:map.keySet())
             System.out.println(key+"  "+map.get(key));

         //13, Reduction - sum
//        double total=Stream.of(7.3,5,12.3,6,2.4)
//                .reduce(0.0,(Double a,Double b)->a+b);
//        System.out.println("Total ="+total);

        //14, Reduction - summary statistics
        IntSummaryStatistics summaryStatistics=IntStream.of(7,2,19,88,73,4,10)
                .summaryStatistics();
        System.out.println(summaryStatistics);

    }
}
