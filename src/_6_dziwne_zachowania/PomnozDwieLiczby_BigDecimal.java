package _6_dziwne_zachowania;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class PomnozDwieLiczby_BigDecimal {


    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
                // scanner uwzglednia ustaweinia regionalne . ,
        wejscie.useLocale(Locale.US); // teraz dzialaja tylko .
        System.out.println("Podaj dwie liczby");

        BigDecimal arg1 = wejscie.nextBigDecimal();
        BigDecimal arg2 = wejscie.nextBigDecimal();

        BigDecimal wynik = arg1.multiply(arg2) ;   //BigDecimal jest klasa i trzeba metod uzywac
        System.out.println(wynik);
            wynik = wynik.setScale(2, RoundingMode.HALF_UP);   // zaokraglanie
                System.out.println(wynik);


    }


}
