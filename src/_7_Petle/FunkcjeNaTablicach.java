package _7_Petle;

import java.util.FormatFlagsConversionMismatchException;

public class FunkcjeNaTablicach {


    static int suma(int[] tablica){

        int sumatablica=0 ;

            for (int i = 0; i < tablica.length ; i++){

                int wynik = tablica[i] % 2;

                if (wynik==0){


             sumatablica+=tablica[i];
                }
            }
     //   for (int liczba : tablica){
     //       sumatablica+=liczba;
     //   }

            return sumatablica;
    }




    // dla wygody main z testami w 1 pliku
    public static void main(String[] args) {

        int [] a = {10,20,30,5,10,15} ;
        int [] b = {-20,0,5,20} ;



        System.out.println("Suma tablica a : " + suma(a));
        System.out.println("suma tablicy b : " + suma(b));

    }

}
