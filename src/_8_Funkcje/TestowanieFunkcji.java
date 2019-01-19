package _8_Funkcje;

public class TestowanieFunkcji {
    public static void main(String[] args) {
        double[] liczby = {0,5,1.5,-1,10};


        for (double liczba : liczby)  // petle for dla kazdej liczby z tablicy liczba !!
        {
            double kwadrat = FunkcjeGeometryczne.PoleKola(liczba);
            double kolo = FunkcjeGeometryczne.PoleKwadratu(liczba);
            System.out.println("Dla liczby : "+liczba + "  pole kwadratu wynosi : "+kwadrat +
                    " a pole kola wynosi: "+kolo);


        }



    }



}
