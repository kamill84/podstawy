package _99_ZadaniaDomowe;

import javax.swing.*;
import java.awt.*;

public class Okno1 {


    public static void main(String[] args) {



    JFrame frame = new JFrame();  // frame  - okno, tworzy okno
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // zamkniecia okna zamyka program
        frame.setSize(600,400);  // w pikselach
        frame.setTitle("BMI");  // tytuł

        LayoutManager layout = new FlowLayout();
        frame.setLayout(layout);


        JLabel label = new JLabel("Waga :");  // do tekstu i grafiki
        label.setHorizontalAlignment(SwingConstants.LEFT); // wysierodkowanie
        label.setFont(new Font("Arial", Font.BOLD,40));  // czcionka
        label.setForeground(Color.RED);  // kolor
        frame.add(label);


        JLabel label2 = new JLabel("Wzrost:");  // do tekstu i grafiki
        label2.setHorizontalAlignment(SwingConstants.LEFT); // wysierodkowanie
        label2.setFont(new Font("Arial", Font.BOLD,40));  // czcionka
        label2.setForeground(Color.RED);  // kolor
        frame.add(label2);


        JButton button = new JButton("Oblicz") ;
        button.setFont(new Font("Arial", Font.BOLD,40)); ;

        frame.add(button);  // dodanie przycisku na dole


        JLabel label3 = new JLabel("BMI:");  // do tekstu i grafiki
        label3.setHorizontalAlignment(SwingConstants.LEFT); // wysierodkowanie
        label3.setFont(new Font("Arial", Font.BOLD,40));  // czcionka
        label3.setForeground(Color.RED);  // kolor
        frame.add(label3);







        frame.setVisible(true);
}
}
