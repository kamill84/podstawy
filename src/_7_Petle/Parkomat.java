package _7_Petle;

import java.util.Scanner;

public class Parkomat {
    // zapytaj ile godzin bedziesz parkowac, (podajesz ile godzin
    // prorgam obilcza kwote do zaplaty  1h=3zl
    // program prosi o wrzucenie kolejno monet az uzytkownik wrzuci wymagana kwote
    //

    public static void main(String[] args) {

        int godzinypostoju;
        int zaplata;
        int CENA = 3;

        Scanner wejscie = new Scanner(System.in);

        System.out.println("Podaj dlugosc postoju :  ");
        godzinypostoju =  wejscie.nextInt();
        zaplata = godzinypostoju*CENA;

        System.out.println("Do zaplaty : " +zaplata);



        while (zaplata>0){
            System.out.print("Wrzuc kolejna monete : ");
            int moneta = wejscie.nextInt();
            zaplata -= moneta ;


        }

        System.out.println("zaplacono");
         if (zaplata <0){
             zaplata=Math.abs(zaplata);
            System.out.println("reszta wynosi " +zaplata);
         }

    }



}
