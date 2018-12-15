package _2_typy_danych;

import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {
    public static void main(String[] args) {
        Szkolenie szkolenieJava = new Szkolenie("Szkolenie Java", 10, 1000, LocalDate.of(2018, Month.DECEMBER, 15));


        szkolenieJava.nazwa = "Szkolenie Java";
        szkolenieJava.cena = 1000;
        szkolenieJava.liczbaUczestnikow= 10;
        szkolenieJava.data= LocalDate.of(2018, Month.DECEMBER, 15);


        System.out.println(szkolenieJava.nazwa);
        System.out.print(" cena : ");
        System.out.printf("%.2f\n",szkolenieJava.cena);
     //  System.out.println(" zł ");
        System.out.println(" Uczestnikow : "+szkolenieJava.liczbaUczestnikow);
        System.out.println(" dzien szkolenia  : "+szkolenieJava.data);



        Szkolenie szkoleniePython = new Szkolenie();
        szkoleniePython.nazwa = "Szkolenie Python";
        szkoleniePython.cena = 1200;
        szkoleniePython.liczbaUczestnikow= 20;
        szkoleniePython.data= LocalDate.of(2018, Month.NOVEMBER, 25);


       // System.out.println(szkoleniePython.nazwa);
       // System.out.print(" cena : ");
       // System.out.print(szkoleniePython.cena);
       // System.out.println(" zł ");
       // System.out.println(" Uczestnikow : "+szkoleniePython.liczbaUczestnikow);
       // System.out.println(" dzien szkolenia  : "+szkoleniePython.data);


    }
}
