import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class notepadView {

    public JButton getNyttButton() {
        return nyttButton;
    }

    public JButton getSparaButton() {
        return sparaButton;
    }

    public JButton getÖppnaButton() {
        return öppnaButton;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    private JPanel panel1;
    private JTextArea textArea1;
    private JButton öppnaButton;
    private JButton sparaButton;
    private JButton nyttButton;
}