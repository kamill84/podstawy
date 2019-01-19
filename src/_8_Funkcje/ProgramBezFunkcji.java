package _8_Funkcje;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBezFunkcji {


    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US); // . zamiast ,


        System.out.print("Podaj liczbe: ");
        double x = wejscie.nextDouble();

        double polekwadratu = x*x ;
        System.out.println("pole kwadratu wynosi: "+polekwadratu);

        double polekola =Math.PI*x*x;
        System.out.println("Pole kola wynosi: "+polekola);


        System.out.println("A teraz wylosuje sobie liczbe ");
        double losowa = Math.random()*100; // losowa liczba 0-1
        System.out.println(losowa);

        double polekwadratu2 = losowa*losowa ;
        System.out.println("pole kwadratu wynosi: "+polekwadratu2);

        double polekola2 =Math.PI*losowa*losowa;
        System.out.println("Pole kola wynosi: "+polekola2);

    }
}
