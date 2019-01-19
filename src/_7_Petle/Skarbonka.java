package _7_Petle;

import java.util.Scanner;

public class Skarbonka {

    public static void main(String[] args) {


            /*    while (warunek) { instrukcje} - while wykona sie jak warunek jest spelniony */


            // jas ma skarbonke i program prosi o wrzucenie pieniazka do zebrania 100 zl


        Scanner wejscie = new Scanner(System.in);

        int skarbonka =0 ;


         while (skarbonka < 100) {
             System.out.print("Wrzuc kolejna monete : ");
             int moneta = wejscie.nextInt();
             skarbonka = skarbonka + moneta ;

         }

        System.out.println("Udalo sie zebrac :  " +skarbonka);


    }









}
