package DALTUD_try;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class haha extends JFrame{
    JTextArea ta;
    JButton exitButton;
    JButton resetButton;
    JPanel HumanRDF;
    JTextField textField;
    JButton enterButton;
    JComboBox comboBox1;
    JButton selectButton;

    public haha(){
        this.setTitle("Human readable duration format");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(HumanRDF);
        this.setSize(900,350);

        enterButton.addActionListener(new TimeFormatterController(this));
        resetButton.addActionListener(new TimeFormatterController(this));
        exitButton.addActionListener(new TimeFormatterController(this));
    }

    public static void main(String[] args){
        JFrame frame = new haha();
        frame.setVisible(true);
    }

}


