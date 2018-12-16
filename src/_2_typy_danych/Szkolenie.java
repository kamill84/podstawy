package _2_typy_danych;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Szkolenie {

           // double cena;
            BigDecimal cena;
            int liczbaUczestnikow;
            String nazwa;
            LocalDate data;
            Adres adres;

     // 1. tworzenie nowego obiektu

    // budowa konstruktora = public/private nazwa (lista paramaterow)
    // nazwa - [taka sama jak klasa]
    // konstruktor bezparametryczny
    public Szkolenie() {
        System.out.println("Wykonał sie konstruktor bezparametryczny");
    }


    // konstruktor parametryczny
    public Szkolenie(String nazwa, int liczbaUczestnikow, BigDecimal cena, LocalDate data, Adres adres){
        System.out.println("wykonal sie konstruktor parametryczny");
        this.nazwa = nazwa ;
        this.liczbaUczestnikow = liczbaUczestnikow;
        this.cena = cena;
        this.data = data;
        adres.wyswietl();
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

 public BigDecimal przychodBrutto (){
        return  cena.multiply(BigDecimal.valueOf(liczbaUczestnikow));

 }

 public BigDecimal przychodNetto (){
      //  double netto=this.liczbaUczestnikow* this.cena*(1+StaleAplikacji.STAWKA_VAT);
        BigDecimal listaucz = BigDecimal.valueOf(liczbaUczestnikow);
        BigDecimal zysk = cena.multiply(listaucz) ;
        BigDecimal stawka = BigDecimal.valueOf(1+StaleAplikacji.STAWKA_VAT);
        BigDecimal koncowa = zysk.divide(stawka, 2, RoundingMode.HALF_UP);
        return koncowa;


 }






}
