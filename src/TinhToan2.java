
package XuLySuKien;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TinhToan2 extends JFrame {
        JTextField ta, tb, tc;
        public TinhToan2() {
            this.setTitle("Tinh Toan");
            this.setSize(400, 400);
            this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));

            this.setLayout(new GridLayout(4, 1));
            JLabel l1 = new JLabel("Minh hoa cac phep toan!");
            l1.setHorizontalAlignment(SwingConstants.CENTER);
            l1.setFont(new Font("Timesnewroman", Font.BOLD, 20));
            this.add(l1);

            // set panel 2
            JPanel p2 = new JPanel();
            p2.setLayout(new GridLayout(3, 2));

            JLabel la = new JLabel("Nhap a:");
            p2.add(la);
            ta = new JTextField();
            p2.add(ta);

            JLabel lb = new JLabel("Nhap b:");
            p2.add(lb);
            tb = new JTextField();
            p2.add(tb);

            JLabel lc = new JLabel("Ket qua:");
            p2.add(lc);
            tc = new JTextField();
            p2.add(tc);

            this.add(p2);
            //---------

            // set panel 3
            JPanel p3 = new JPanel();
            p3.setLayout(new GridLayout(1, 4));

            JButton bcong = new JButton("Cong");
            bcong.addActionListener(new haha(this));
            p3.add(bcong);

            JButton btru = new JButton("Tru");
            btru.addActionListener(new haha(this));
            p3.add(btru);

            JButton bnhan = new JButton("Nhan");
            bnhan.addActionListener(new haha(this));
            p3.add(bnhan);

            JButton bchia = new JButton("Chia");
            bchia.addActionListener(new haha(this));
            p3.add(bchia);

            this.add(p3);
            //-----------

            // set panel 4
            JPanel p4 = new JPanel();
            p4.setLayout(new GridLayout(1, 2));

            JButton bexit = new JButton("Exit");
            p4.add(bexit);

            JButton breset = new JButton("Reset");
            p4.add(breset);

            this.add(p4);
            //---------


            this.setVisible(true);
        }

        public static void main(String[] args) {
            new XuLySuKien.TinhToan2();
        }
    }

    class haha implements ActionListener{
        TinhToan2 obj;
        public haha(TinhToan2 obj){
            this.obj = obj;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Cong")){
                try{
                    double a = Double.parseDouble(obj.ta.getText());
                    double b = Double.parseDouble(obj.tb.getText());
                    obj.tc.setText((a+b)+"");
                } catch (Exception e1){}
            } else if(e.getActionCommand().equals("Tru")){
                double a = Double.parseDouble(obj.ta.getText());
                double b = Double.parseDouble(obj.tb.getText());
                obj.tc.setText((a-b)+"");
            }
        }
    }

