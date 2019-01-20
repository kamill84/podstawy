package _10_swing;

import javax.swing.*;

public class okno2 {

    public static void main(String[] args) {

        JFrame frame = new JFrame();  // frame  - okno, tworzy okno
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // zamkniecia okna zamyka program
        frame.setSize(600,400);  // w pikselach
        frame.setTitle("Nasze Pierwsze Okno");  // tytuł

        JLabel label = new JLabel("Ala ma kota");            // do tekstu i grafiki
        frame.add(label);


        frame.setVisible(true);




    }






}
