package _4_Kolekcje;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapa {

    public static void main(String[] args) {


        Map<String,Integer> inwentarz = new TreeMap<>(); //HashMap();  // Mapa ma dwa elementy


            inwentarz.put("Mysz", 4);
            inwentarz.put("Glosniki", 10);
            inwentarz.put("Monitor",2);


     //   System.out.println(inwentarz);

            inwentarz.put("Mysz", 10);

      //  System.out.println(inwentarz);

       // System.out.println(inwentarz.get("Glosniki"));


     //   System.out.println(inwentarz.keySet());
                int ilosc=0;

        for (String klucz : inwentarz.keySet()){
           ilosc=ilosc + inwentarz.get(klucz);
        }
        System.out.println(ilosc);



    }

}
