import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.*;

public class guitest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Note19pad");
        guitest gui = new guitest();
        frame.setContentPane(gui.panel1);
        frame.setJMenuBar(gui.menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public guitest() {
        //Create the menu bar.
        menuBar = new JMenuBar();

        nyttButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });


        öppnaButton.addActionListener(e -> {
            try
            {
                FileReader reader = new FileReader( "test.txt" );
                BufferedReader br = new BufferedReader(reader);
                textArea1.read( br, null );
                br.close();
                textArea1.requestFocus();
            }
            catch(Exception e2) { System.out.println(e2); }
        });

        JButton write = new JButton("Write test.txt");
        write.addActionListener(e -> {
            try
            {
                FileWriter writer = new FileWriter( "test.txt" );
                BufferedWriter bw = new BufferedWriter( writer );
                textArea1.write( bw );
                bw.close();
                textArea1.setText("");
                textArea1.requestFocus();
            }
            catch(Exception e2) {}
        });




    }

    private JButton clearButton;
    private JButton CopyButton;
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton öppnaButton;
    private JButton sparaButton;
    private JButton nyttButton;

    private JMenuBar menuBar;
    private JMenu menu, submenu;
    private JMenuItem menuItem, menuItemNew;
    private JRadioButtonMenuItem rbMenuItem;
    private JCheckBoxMenuItem cbMenuItem;
}