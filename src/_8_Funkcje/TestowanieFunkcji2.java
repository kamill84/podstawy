package _8_Funkcje;

import static _8_Funkcje.FunkcjeGeometryczne.PoleKola;
import static _8_Funkcje.FunkcjeGeometryczne.PoleKwadratu;

public class TestowanieFunkcji2 {


    public static void main(String[] args) {

        System.out.println("pole kwardaru o boku 2 wynosi : " + PoleKwadratu(2));
        System.out.println("pole kola o boku 2 wynosi : " + PoleKola(2));


        System.out.println("pole kwardaru o boku 2 wynosi : " + FunkcjeGeometryczne.PoleKwadratu(2));
        System.out.println("pole kola o boku 2 wynosi : " + PoleKola(2));

        // 2 rozne wywolania











    }
}
