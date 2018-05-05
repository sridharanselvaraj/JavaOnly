package Enum;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(UserStatus.ACTIVE);
        System.out.println(WhoisRIP.APNIC.url());
        double result=Operation.PLUS.calculate(3,4);
        System.out.println(result);

        Scanner scanner=new Scanner(System.in);
        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Ebay");
        arrayList.add("Amazon");
        arrayList.add("Aol");
        arrayList.add("Yahoo");

        List<String> syncList=Collections.synchronizedList(arrayList);

        System.out.println(syncList);

        Map<String,String> syncMap=new HashMap<String,String>();
        syncMap.put("1","eBay");
        syncMap.put("2","Paypal");
        syncMap.put("3","Google");
        syncMap.put("4","Yahoo");

        Map<String,String> syncMaps=Collections.synchronizedMap(syncMap);
        System.out.println("syncho Map "+syncMaps);

    }
}
