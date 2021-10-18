import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class notepadController {
    private notepadView notepadView;
    public notepadController() {
        JFrame frame = new JFrame("Note19pad");
        notepadView = new notepadView();
        frame.setContentPane(notepadView.getPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        addEventlisteners();
    }

    public static void main(String[] args) {
        notepadController c = new notepadController();
    }

    public void addEventlisteners() {
        notepadView.getNyttButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notepadView.getTextArea1().setText("");
            }
        });

        notepadView.getÖppnaButton().addActionListener(e -> {
            try
            {
                FileReader reader = new FileReader("test.txt");
                BufferedReader br = new BufferedReader(reader);
                notepadView.getTextArea1().read( br, null );
                br.close();
                notepadView.getTextArea1().requestFocus();
            }
            catch(Exception e2) { System.out.println(e2); }
        });

        notepadView.getSparaButton().addActionListener(e -> {
            try
            {
                FileWriter writer = new FileWriter("test.txt");
                BufferedWriter bw = new BufferedWriter( writer );
                notepadView.getTextArea1().write( bw );
                bw.close();
                notepadView.getTextArea1().setText("");
                notepadView.getTextArea1().requestFocus();
            }
            catch(Exception e2) {}
        });
    }

}
