package DALTUD_try;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstMenu extends JFrame {
    JButton rulesButton;
    JButton formatterFormButton;
    JButton exitButton;
    JPanel menu;

    public firstMenu(){
        this.setTitle("Human readable duration format");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(menu);
        this.setSize(300,300);

        formatterFormButton.addActionListener(new MenuController(this));
        exitButton.addActionListener(new MenuController(this));
        rulesButton.addActionListener(new MenuController(this));
    }

    public static void main(String[] args){
        JFrame frame = new firstMenu();
        frame.setVisible(true);
    }
}
class MenuController implements ActionListener {
    firstMenu obj1;
    public static haha newForm = new haha();
    public static readRules obj2 = new readRules();
    public MenuController(firstMenu obj) {this.obj1 = obj;}
    @Override
    public void actionPerformed(ActionEvent q) {
        if(q.getActionCommand().equals("Formatter form")){
            try{
                newForm.setVisible(true);
                obj1.setVisible(false);
            } catch (Exception m){}

        } else if (q.getActionCommand().equals("Exit")){
            try{
                System.exit(0);
            }
            catch (Exception e){}
        } else if (q.getActionCommand().equals("Rules")){
            try{
                obj2.setVisible(true);
            } catch (Exception e){}
        }

    }

}

