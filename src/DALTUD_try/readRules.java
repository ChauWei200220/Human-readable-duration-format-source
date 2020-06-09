package DALTUD_try;

import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class readRules extends JFrame {

    //String t = "The function must accept a non-negative integer. If it is zero, it just returns \"now\". Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.The function must accept a non-negative integer. If it is zero, it just returns \"now\". Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.";
    public readRules(){
        this.setTitle("Read this Rules!");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(800,400);

        JTextArea text = new JTextArea();
        JScrollPane text2 = new JScrollPane();
        text.setText("The function must accept a non-negative integer. If it is zero, it just returns \"now\". Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.\n" +
                "\n" +
                "It is much easier to understand with an example:\n" +
                "\n" +
                "formatDuration(62)    // returns \"1 minute and 2 seconds\"\n" +
                "formatDuration(3662)  // returns \"1 hour, 1 minute and 2 seconds\"\n" +
                "\n" +
                "Note that spaces are important.\n" +
                "\n" +
                "Detailed rules\n" +
                "The resulting expression is made of components like 4 seconds, 1 year, etc. In general, a positive integer and one of the valid units of time, separated by a space. The unit of time is used in plural if the integer is greater than 1.\n" +
                "\n" +
                "The components are separated by a comma and a space (\", \"). Except the last component, which is separated by \" and \", just like it would be written in English.\n" +
                "\n" +
                "A more significant units of time will occur before than a least significant one. Therefore, 1 second and 1 year is not correct, but 1 year and 1 second is.\n" +
                "\n" +
                "Different components have different unit of times. So there is not repeated units like in 5 seconds and 1 second.\n" +
                "\n" +
                "A component will not appear at all if its value happens to be zero. Hence, 1 minute and 0 seconds is not valid, but it should be just 1 minute.\n" +
                "\n" +
                "A unit of time must be used \"as much as possible\". It means that the function should not return 61 seconds, but 1 minute and 1 second instead. Formally, the duration specified by of a component must not be greater than any valid more significant unit of time.\n");
        text.setColumns(20);
        text.setRows(3);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text2.setViewportView(text);


        add(text2);

    }
    public static void main(String[] args){
        JFrame formRules = new readRules();
        formRules.setVisible(true);
    }
}