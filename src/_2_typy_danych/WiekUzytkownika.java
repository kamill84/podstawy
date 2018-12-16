package _2_typy_danych;

import com.sun.org.apache.xerces.internal.util.DatatypeMessageFormatter;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WiekUzytkownika {




    public static void main(String[] args) {

        LocalDate dataurodzenia;
        LocalDate aktualnyczas;
        int wiek;

        Scanner urodzenie = new Scanner(System.in);

        System.out.println(" Podaj date urodzenia  : ");
        System.out.println(" Format daty w formacie :  yyyy-MM-dd ");

        String data = urodzenie.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        dataurodzenia = LocalDate.parse(data, formatter);

        System.out.println("Podaj plec : ");
        String plec = urodzenie.nextLine();


        // aktualny rok

        aktualnyczas=LocalDate.now();


    Period roznica = Period.between(dataurodzenia,aktualnyczas);

        int roznicalat = roznica.getYears();


            if (roznicalat < 18){
                System.out.println("Nieletni");
            }


        if (plec.equals("M")){

            if ((roznicalat >= 18) && (roznicalat < 65)){
                System.out.println("wiek produkcyjny");
            }

            if (roznicalat > 65){
                System.out.println("Emeryt");
            }}


        if (plec.equals("K")){

            if ((roznicalat >= 18) && (roznicalat < 67)){
                System.out.println("wiek produkcyjny");
            }

            if (roznicalat > 65){
                System.out.println("Emeryt");
            }}




        System.out.println(dataurodzenia);
        System.out.println(aktualnyczas);
        System.out.println(roznicalat);

    }






}
