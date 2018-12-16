package _2_typy_danych;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class ObslugaSzkolen {
    public static void main(String[] args) {
        Adres adresszkoleniaJava = new Adres("Polna 5", "01-001", "Warszawa");
        Szkolenie szkolenieJava = new Szkolenie("Szkolenie Java",
                10, new BigDecimal("1000"),
                LocalDate.of(2018, Month.DECEMBER, 15), adresszkoleniaJava);


                    szkolenieJava.wyswietl();


        Szkolenie szkoleniePython = new Szkolenie(
                "Szkolenie Python", 5, new BigDecimal("1300"),
                LocalDate.of(2019, Month.FEBRUARY, 1), adresszkoleniaJava);


                     szkoleniePython.wyswietl();



         // Adres Klient = new Adres("Polna","43-400","Kraków");

         // Klient.wyswietl();


          szkolenieJava.przychodBrutto();
        System.out.println(szkolenieJava.przychodBrutto());

        szkolenieJava.przychodNetto();
        System.out.println(szkolenieJava.przychodNetto());




    }
}
