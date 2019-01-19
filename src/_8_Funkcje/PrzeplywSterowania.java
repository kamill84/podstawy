package _8_Funkcje;

public class PrzeplywSterowania {


    static void metoda0(){
        System.out.println("To jest metoda 0");

    }
    static void metoda1(){
        System.out.println("metoda 1");

    }

    public static void main(String[] args) {

        System.out.println("Poczatek programu ");
        metoda1();  // nie trzeba podawac nazwy klasy gdy jestesmy w tej klasie
        System.out.println(" A Znowu jestem w main");
        metoda1();
        System.out.println(" B Znowu jestem w main");
        metoda2( "Ala ma kota");
        System.out.println();
        metoda2("Katowice");
       int wynik = powtorz("Kamil", 4);
        System.out.println(wynik);
    }

    static void metoda2(String napis){
        System.out.println("metoda 2 otrzymala parametr:  " +napis);
        System.out.println("Ten napis ma liter: "+ napis.length());
        System.out.println("A napisane wielkimi literami :" +napis.toUpperCase());

    }


    static int powtorz(String napis, int ileRazy){
        for (int i=0 ; i < ileRazy ; i++){
            System.out.println(napis);
        }
        return napis.length()*ileRazy;
    }
}
