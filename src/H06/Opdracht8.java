package H06;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht8 extends Applet {

    Button Knop1;
    Button resetbtn;
    TextField Texstplace;
    int counter;
    int cliks;

    public void init() {
        Knop1 = new Button ("click here" );
        add(Knop1);

        resetbtn = new Button("reset");
        add(resetbtn);
        resetbtn.addActionListener(new resetLabel());



        Texstplace = new TextField();
        add(Texstplace);
        Knop1.addActionListener(new Texstohere());
        counter = 0;
        cliks = 1 + counter;
        setBackground(Color.darkGray);

}


    public void paint(Graphics g) {
        Knop1.setLocation(20, 30);
        Knop1.setLabel("click this "+ counter);

        resetbtn.setLocation(100, 30);
        resetbtn.setLabel("reset");
        Texstplace.setLocation(20, 80);





        //knop1.setSize();
    }

    class resetLabel implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Texstplace.setText("");
            repaint();
        }
    }

    class Texstohere implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           System.out.println("knopcliked " + counter);
            counter++;
            repaint();
        }
        //25:13
    }
}