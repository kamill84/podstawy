package _2_typy;

import java.util.Scanner;

public class TypyObiektowe {

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);

        System.out.print(" Podaj imie : ");

        String imie = wejscie.nextLine();

        int iloscZnakow = imie.length();

        boolean plec= imie.endsWith("a") || imie.endsWith("A");


            if (iloscZnakow <= 6 ) {
            System.out.println("krotkie slowo");
        } else {
            System.out.println("dlugie slowo");
        }


        if (imie.equals("Kuba")){}


        if (plec && !imie.equalsIgnoreCase("Kuba")) {
            System.out.println("damskie");
        } else {
            System.out.println("meskie");
        }


        System.out.println(" Słowo: "+imie + " ma " +iloscZnakow+ " znakow");



    }
}
