package _6_dziwne_zachowania;

import java.util.Locale;
import java.util.Scanner;

public class PomnozDwieLiczby_Int {


    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
                // scanner uwzglednia ustaweinia regionalne . ,
        // wejscie.useLocale(Locale.US); // teraz dzialaja tylko .
        System.out.print("Podaj dwie liczby :  ");

        int arg1 = wejscie.nextInt();
        int arg2 = wejscie.nextInt();

        int wynik = arg1 * arg2 ;
       // System.out.println(wynik);



        // System.out.println("wynik poprawny " +wynik2);
        // ctrl+alt+t - 5 try catch !!!!!!!!!!!!!! wyjatek


        try {       // obsluga wyjatku
            int wynik2 = Math.multiplyExact(arg1,arg2);
           // System.out.println("Max int wynosi : " + Integer.MAX_VALUE);
        } catch (ArithmeticException e) {
            System.out.println("wynik nie miesci sie w zakresie");
             //  e.printStackTrace();  domyslnie, zamiast tego np. sout
        }



       // System.out.println(wynik2);


    }


}
