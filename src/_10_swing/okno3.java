package _10_swing;

import javax.swing.*;
import java.awt.*;

public class okno3 {

    public static void main(String[] args) {

        JFrame frame = new JFrame();  // frame  - okno, tworzy okno
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // zamkniecia okna zamyka program
        frame.setSize(600,400);  // w pikselach
        frame.setTitle("Nasze Pierwsze Okno");  // tytuł

        JLabel label = new JLabel("Ala ma kota");  // do tekstu i grafiki
        label.setHorizontalAlignment(SwingConstants.CENTER); // wysierodkowanie
        label.setFont(new Font("Comic Sans MS", Font.BOLD,40));  // czcionka
        label.setForeground(Color.RED);  // kolor


        // 1)
        Color kolorTla = Color.yellow;  // ustawienie koloru tla
        // 2)
        Color kolor = new Color(1.0f,1.0f,0.5f);
        // 3
        Color kolorr = new Color(255,255,150);
        // 4
        Color kol = new Color(0xFFFF90);

         label.setOpaque(true);  // przeztoczystosc na 0 - widac tlo
         label.setBackground(kol);

        frame.add(label);  // dodanie do frame label (tekstu)


        frame.setVisible(true);




    }






}
