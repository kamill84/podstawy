package _4_Kolekcje;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zbior {

    public static void main(String[] args) {
        Set<String> numeryPesel = new HashSet<>();  // losowy zbior

                numeryPesel.add("45645645646");
                numeryPesel.add("78979878978");
                numeryPesel.add("12311231213");
                numeryPesel.add("43254364654");
                numeryPesel.add("78979878978");

                //    System.out.println(numeryPesel);


             //       numeryPesel.remove("78979878978");
           // System.out.println(numeryPesel);

     //  if ( numeryPesel.contains("78979878978") ){
     //      System.out.println("istnieje");
    //   }

       Set<String> posortowany = new TreeSet<>();  // Posortowane elemnty

       posortowany.addAll(numeryPesel);
   //     System.out.println(posortowany);


        Set<String> kolejnosc = new LinkedHashSet<>();  //nie zmienia kolejnosci

        kolejnosc.add("kamil");
        kolejnosc.add("Joanna");
        kolejnosc.add("Jarek");

        System.out.println(kolejnosc);


    }
}
