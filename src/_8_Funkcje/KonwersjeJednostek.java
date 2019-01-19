package _8_Funkcje;

public class KonwersjeJednostek {


    public static final double Mila = 1.609344;    // stała

    public static double MileNaKilometry(double a) {
        return a * Mila;

    }

    public static double KilometryNaMila(double a) {
        return a / Mila;
    }

      public static double FarenheitNaCelciusz(double a){
        double b = (a-32)/1.8;
        return b;}


      public static double CelciuszNaFarenhaita(double a){
        double b = (a*1.8)+32;
        return b ;}


}
