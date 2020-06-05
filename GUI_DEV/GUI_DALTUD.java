import javax.swing.*;
import java.awt.*;

public class GUI_DALTUD extends JFrame{

    private JPanel firstPanel;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea4;
    private JTextArea textArea5;
    private JButton enterButton;
    private JButton resetButton;
    private JTextField textField1;
    private JButton historyButton;
    private JRadioButton greenColorRadioButton;
    private JRadioButton redColorRadioButton;

    public GUI_DALTUD(){
        this.setTitle("Human readable");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(firstPanel);
    }

    public static void main(String[] args){
        JFrame frame = new GUI_DALTUD();
        frame.setVisible(true);
    }
}

