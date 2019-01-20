package _10_swing;

import javax.swing.*;
import java.awt.*;

public class okno4 {

    public static void main(String[] args) {

        JFrame frame = new JFrame();  // frame  - okno, tworzy okno
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // zamkniecia okna zamyka program
        frame.setSize(600,400);  // w pikselach
        frame.setTitle("Nasze Pierwsze Okno");  // tytuł

        JLabel label = new JLabel("Ala ma kota");  // do tekstu i grafiki
        label.setHorizontalAlignment(SwingConstants.CENTER); // wysierodkowanie
        label.setFont(new Font("Comic Sans MS", Font.BOLD,40));  // czcionka
        label.setForeground(Color.RED);  // kolor


        Color kolorr = new Color(255,255,150);


         label.setOpaque(true);  // przeztoczystosc na 0 - widac tlo
         label.setBackground(kolorr);

        frame.add(label);  // dodanie do frame label (tekstu)


            JButton button = new JButton("OK") ;
            button.setFont(new Font("Comic Sans MS", Font.BOLD,40)); ;

            frame.add(button,BorderLayout.SOUTH);  // dodanie przycisku na dole


        frame.setVisible(true);




    }






}
