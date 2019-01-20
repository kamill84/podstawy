package _9_KalkulatorKonsolowy;

import java.util.Scanner;

public class Kalkulator2 {

    public static void main(String[] args) {

        System.out.println("Podaj dzialanie w formacie: ");
        System.out.println(" 12 + 15 ");
        System.out.println(" zakoncz podajac nie liczbe");

    Scanner wejscie = new Scanner(System.in);


    while (true){
        System.out.print("   >  ");
       try{
           double arg1 = wejscie.nextDouble();  // Scanner wyrzuca wyjatek w tym przypadku dlatego łapiemy wyjatek
           String operacja = wejscie.next();
           double arg2 = wejscie.nextDouble();
           double wynik;

// Java nie porownuje string

           switch (operacja){
               case "+":
                   wynik = arg1 + arg2;
                   break;
               case "-":
                   wynik = arg1 - arg2;
                    break;
               case "*":
                   wynik = arg1 * arg2;
                    break;
               case "/":
                   wynik = arg1 / arg2;
                    break;
                default: wynik = 0;
           }

           System.out.println(" Wynik to : " + wynik);


       } catch (Exception e) {

           break;
       }
    }
        System.out.println("Koniec programu ");


}
}
