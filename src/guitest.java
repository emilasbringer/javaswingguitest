import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

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

    }

    private JButton clearButton;
    private JButton CopyButton;
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton arkivButton;
    private JButton formatButton;
    private JButton redigeraButton;
    private JButton visaButton;
    private JButton hjälpButton;

    private JMenuBar menuBar;
    private JMenu menu, submenu;
    private JMenuItem menuItem, menuItemNew;
    private JRadioButtonMenuItem rbMenuItem;
    private JCheckBoxMenuItem cbMenuItem;
}