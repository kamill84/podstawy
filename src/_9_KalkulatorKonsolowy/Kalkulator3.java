package _9_KalkulatorKonsolowy;

import java.util.Scanner;

public class Kalkulator3 {

    public static void main(String[] args) {

        System.out.println("Podaj dzialanie w formacie: ");
        System.out.println(" 12 + 15 ");
        System.out.println(" zakoncz podajac nie liczbe");

    Scanner wejscie = new Scanner(System.in);



            while (true){
        System.out.print("   >  ");

                if(! wejscie.hasNextDouble()) {
                    break; // koniec
                }


    try {
        double arg1 = wejscie.nextDouble();  // Scanner wyrzuca wyjatek w tym przypadku dlatego łapiemy wyjatek
        String operacja = wejscie.next();
        double arg2 = wejscie.nextDouble();
        double wynik = Oblicz(arg1, arg2, operacja);

        System.out.println(" Wynik to : " + wynik);
    } catch (Exception e){
        System.out.println("Blad: " +e.getMessage());

    }

       }

        //System.out.println("Koniec programu ");


}

    private static double Oblicz(double arg1, double arg2, String operacja){

        switch (operacja){
            case "+":
                return arg1 + arg2;
            case "-":
               return arg1 - arg2;
            case "*":
                return arg1 * arg2;
            case "/":
                return  arg1 / arg2;
             default: throw new IllegalArgumentException("Nieznana Operacja " + operacja);
        }
    }
}
