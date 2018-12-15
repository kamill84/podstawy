package _2_typy_danych;

import java.time.LocalDate;

public class Adres {
    String ulica;
    String kod;
    String miasto;



    public Adres() {
        System.out.println("Wykonał sie konstruktor bezparametryczny");
    }


    public Adres(String ulica,String kod, String miasto ){
        System.out.println("wykonal sie konstruktor parametryczny");
        this.ulica =ulica;
        this.kod = kod;
        this.miasto = miasto;

    }

    public void wyswietl(){
        System.out.println("Ulica: "+this.ulica);
        System.out.println("kod : "+this.kod);
        System.out.println("miasto : "+this.miasto);


    }
}
