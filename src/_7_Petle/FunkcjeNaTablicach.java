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

    static Integer maksimum(int[] tablica) {
        // roznica Integer - int - w Integer da sie zwrocic null
        if (tablica.length == 0){
            return null;  // obsluga wyjatku - gdy pusta tablica.
        }

        int max = tablica[0];

        for (int i = 0; i < tablica.length; i++) {

            if (tablica[i] > max) {
                max = tablica[i];
            }
        }
        return max;
    }



    // dla wygody main z testami w 1 pliku
    public static void main(String[] args) {

        int [] a = {10,20,30,5,10,15} ;
        int [] b = {-20,0,5,20} ;
        int [] c = {};


        System.out.println("max tablica a : " + maksimum(a));
        System.out.println("max tablicy b : " + maksimum(b));
        System.out.println("max tablicy c : " + maksimum(c));

// obsluga pustej tablicy
        Integer wynik = maksimum(c);
        if(wynik != null) {
            System.out.println("Wynik wynosi " + wynik);
        } else {
            System.out.println("Wyniku nie ma");
        }
        System.out.println();






    }

}
