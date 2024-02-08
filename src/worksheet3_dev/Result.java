package worksheet3_dev;

/**
 *
 * @author 20024094
 */

import javax.swing.*;
import java.util.ArrayList;

public class Result extends JFrame {
    
    final ArrayList<String> wordlist = new ArrayList<String>();

    Result() {
        wordlist.add("Brad Pitt");
        wordlist.add("Joaquin Phoenix");
        wordlist.add("Laura Dern");
        wordlist.add("Scarlett Johansson");
        wordlist.add("Margot Robbie");
        wordlist.add("Tom Hanks");
        wordlist.add("Renee Zellweger");
        wordlist.add("Martin Scorsese");
        wordlist.add("Bong Joon Ho");

        JList<String> displayList = new JList<>(wordlist.toArray(new String[0]));
        JScrollPane scrollPane = new JScrollPane(displayList);

        getContentPane().add(scrollPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
