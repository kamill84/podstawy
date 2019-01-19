package _8_Funkcje;

import java.util.Locale;
import java.util.Scanner;

public class ProgramUzywajacyFunkcji {


    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);
        wejscie.useLocale(Locale.US); // . zamiast ,


        System.out.print("Podaj liczbe: ");
        double x = wejscie.nextDouble();



        double polekwadratu = FunkcjeGeometryczne.PoleKwadratu(x) ;
        System.out.println("pole kwadratu wynosi: "+polekwadratu);

        double polekola =FunkcjeGeometryczne.PoleKola(x);
        System.out.println("Pole kola wynosi: "+polekola);


        System.out.println("A teraz wylosuje sobie liczbe ");
        double losowa = Math.random()*100; // losowa liczba 0-1
        System.out.println(losowa);

        double polekwadratu2 = FunkcjeGeometryczne.PoleKwadratu(losowa) ;
        System.out.println("pole kwadratu wynosi: "+polekwadratu2);

        double polekola2 = FunkcjeGeometryczne.PoleKola(losowa);
        System.out.println("Pole kola wynosi: "+polekola2);
                // do printout mozna dodac wywolanie funkcji z innej klasy
    }
}
