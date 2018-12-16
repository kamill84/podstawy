package _2_typy_danych;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TypPieniezny {

    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("5.38");
        BigDecimal b = new BigDecimal("4.99");

        BigDecimal suma = a.add(b);
        BigDecimal roznica = a.subtract(b);
        BigDecimal iloczyn = a.multiply(b).setScale(2,RoundingMode.HALF_UP);
        // nie musi byc setscale przy mnozeniu  - format zapisu
        BigDecimal iloraz = a.divide(b, 2, RoundingMode.HALF_UP);
          // musi byc scale , roundingmode - dzielenie
        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
       System.out.println(iloraz);

    }
}
