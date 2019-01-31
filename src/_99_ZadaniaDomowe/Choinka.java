package _99_ZadaniaDomowe;

import java.util.Scanner;

public class Choinka {


    public static void main(String[] args) {

        char choinka = '*';

        int wielkosc ;

         Scanner wejscie = new Scanner(System.in)  ;


        System.out.println(" podaj wilekosc choinki:  ");
        wielkosc = wejscie.nextInt();

        for(int i =0 ; i <= wielkosc;i++){
            for(int j =0; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
