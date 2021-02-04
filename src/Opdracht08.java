package H06;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht08 extends Applet {
    Button knop;
    Button knoptwee;
    String schermtekst;
    string Plaatsknop;

    public void init() {
        schermtekst = "Doet deze knop wel iets?";
        knop = new Button("Klik op mij");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
        Plaatsknop = "Doet deze knop wel iets?";
        knoptwee = new Button("Klik hier");
        knop.addActionListener( kl );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 60 );
        g.drawString(plaatsknop, 50, 70 );
        //looking for a way to move button 2

    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = "Ja, deze knop doet wel iets";
        }
    }
}
