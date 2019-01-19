package _8_Funkcje;

import java.util.Locale;
import java.util.Scanner;

public class TestyKonwersji {

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US); // . zamiast ,


        double wynik;
        System.out.println("Podaj liczbe");
        wynik=wejscie.nextDouble();


        double pokonwersji = KonwersjeJednostek.MileNaKilometry(wynik);
        System.out.println("w Kilometrach : " +pokonwersji);


        double pokonwersji2 = KonwersjeJednostek.KilometryNaMila(wynik);
        System.out.println("w milach : " +pokonwersji2);


        double pokonwersji3 = KonwersjeJednostek.FarenheitNaCelciusz(wynik);
        System.out.println("w Celciuszach : " +pokonwersji3);

        double pokonwersji4 = KonwersjeJednostek.CelciuszNaFarenhaita(wynik);
        System.out.println("w Farenhaitach : " +pokonwersji4);


    }


}
