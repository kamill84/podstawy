package _8_Funkcje;

public class Parametry1 {

    static void metoda1(int x) {
        System.out.println("metoda1, x = " + x);
        x += 5;
        System.out.println("metoda1, x = " + x);
    }

    static void metoda2(Skarbona skarbonka) {
        System.out.println("metoda2, wartosc = " + skarbonka.wartosc);
        skarbonka.wplata(10);
        System.out.println("metoda2, wartosc = " + skarbonka.wartosc);
    }

    static void metoda3 (int[] tablica){
        System.out.println("metoda3: t[0] =" +tablica[0]);
        tablica[0]+=+7;
        System.out.println("metoda3: t[0] =" +tablica[0]);
        tablica = new int[] {13,14,15,16};
        System.out.println("metoda3: t[0] =" +tablica[0]);

    }


    static void metoda4(Integer y) {
        System.out.println("metoda4, x = " + y);
        y += 3;
        System.out.println("metoda4, x = " + y);
    }





    public static void main(String[] args) {
        int x = 100;
        int[] t = {50,120};
        Integer yy = new Integer(200);

        System.out.println("wartosc metody 4: " + yy);
        metoda4(yy);
        System.out.println("wartosc metoda 4 : " + yy);

        System.out.println("main, x = " + x);
        metoda1(x);
        System.out.println("main, x = " + x);
        System.out.println();

        Skarbona skarbonka = new Skarbona();
        System.out.println("main, wartosc = " + skarbonka.wartosc);
        metoda2(skarbonka);
        System.out.println("main, wartosc = " + skarbonka.wartosc);
        System.out.println("tablica [0] :" + t[0]);
        metoda3(t);
        System.out.println("tablica [0] :" + t[0]);



    }
}


class Skarbona {
    int wartosc = 0;

    void wplata(int ile) {
        wartosc += ile;
    }
}





