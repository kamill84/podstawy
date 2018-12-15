package _2_typy_danych;

import java.time.LocalDate;

public class Szkolenie {

            double cena;
            int liczbaUczestnikow;
            String nazwa;
            LocalDate data;


     // 1. tworzenie nowego obiektu

    // budowa konstruktora = public/private nazwa (lista paramaterow)
    // nazwa - [taka sama jak klasa]
    // konstruktor bezparametryczny
    public Szkolenie() {
        System.out.println("Wykonał sie konstruktor bezparametryczny");
    }


    // konstruktor parametryczny
    public Szkolenie(String nazwa, int liczbaUczestnikow, double cena, LocalDate data){
        System.out.println("wykonal sie konstruktor parametryczny");
        this.nazwa = nazwa ;
        this.liczbaUczestnikow = liczbaUczestnikow;
        this.cena = cena;
        this.data = data;
    }



    // 2. wypisanie informacji o obiekcie
        // tworzenie metody
        // public/private [typ zwracany] [nazwa] [lista parametrów]

 public void wyswietl(){
     System.out.println("Nazwa: "+ this.nazwa);
     System.out.print(" cena : ");
     System.out.printf("%.2f\n",this.cena);
     System.out.println(" Uczestnikow : "+this.liczbaUczestnikow);
     System.out.println(" dzien szkolenia  : "+this.data);

 }
}
