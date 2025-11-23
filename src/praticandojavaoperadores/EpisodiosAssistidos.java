package praticandojavaoperadores;

import javax.swing.*;

public class EpisodiosAssistidos {
    public static void main(String[] args) {

        int episodiosAssistidos = 320;
        int total = 10000;

        boolean terminou = episodiosAssistidos == total;

        JOptionPane.showMessageDialog(null, terminou);
    }
}
