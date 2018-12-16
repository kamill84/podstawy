package _4_Kolekcje;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Lista {

    public static void main(String[] args) {

        List<String> imiona = new ArrayList<>();

            imiona.add("Kamil");
            imiona.add("Joanna");
            imiona.add("Pawel");
            imiona.add("Anna");
       // imiona.add("Kamil");

       // System.out.println(imiona);

    //    System.out.println("Rozmiar: " + imiona.size());


       // System.out.println(imiona.get(1));

        for (String imie : imiona){
            if (imie.endsWith("a")){
              //  System.out.println(imie);

            }

        }

      //  imiona.remove("Kamil"); // do pierwszego wystapienia

       // System.out.println(imiona);

        /*
            if (imiona.contains("Kamil")){

                System.out.println("tak");
            } else {
                System.out.println("nie");
            }

            */

        Collections.sort(imiona);
        System.out.println(imiona);

    }

}
