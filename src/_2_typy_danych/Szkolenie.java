package _2_typy_danych;

import java.time.LocalDate;

public class Szkolenie {

            double cena;
            int liczbaUczestnikow;
            String nazwa;
            LocalDate data;


     // 1. tworzenie nowego obiektu
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



}
