package _3_Tablice;

public class Tablice1 {

    public static void main(String[] args) {

        int[]  tablica =new int[8]; // tworzy tabele 8 elementow

       // System.out.println("Dlugość tablicy: " +tablica.length);

       // System.out.println("Element trzeci : "+ tablica[2]);


      //  System.out.println("element niestetniejacy : " +tablica[8]); - blad
       // int suma = 5;
       // tablica[suma];

      //  tablica[5] = 176;
      //  System.out.println(tablica[5]);
        int[] tablicaWypelniona = {176,185,189,152};


        for (int i=0 ; i <  tablicaWypelniona.length ; i++){
           // System.out.print("Element tablicy "+i);
            System.out.println(tablicaWypelniona[i]);

        }
        System.out.println("");
        for (int j= tablicaWypelniona.length;  j>0 ; j--) {
            System.out.println(tablicaWypelniona[j-1]);
        }




    }
}
