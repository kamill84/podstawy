package _7_Petle;

import java.util.Locale;
import java.util.Scanner;

public class Silnia {

     static long Siln(int n){
        long wynik =1 ;

        for (int i=1; i <= n ; i++)
            wynik=wynik*i;

        return wynik;
    }


    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US);


        System.out.println("podaj liczbe: ");
        int silnia = wejscie.nextInt();
        double sil = Siln(silnia);
        System.out.println(sil);



    }



}
