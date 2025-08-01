import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class calculator {
    public class Calculator implements ActionListener {
        JFrame jF = new JFrame("Calculator");
        JTextField tf1 = new JTextField();
        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JButton b4 = new JButton();
        JButton b5 = new JButton();
        JButton b6 = new JButton();
        JButton b7 = new JButton();
        JButton b8 = new JButton();
        JButton b9 = new JButton();
        JButton b10 = new JButton();
        JButton b11 = new JButton();
        JButton b12 = new JButton();
        JButton b13 = new JButton();
        JButton b14 = new JButton();
        JButton b15 = new JButton();
        JButton b16 = new JButton();
        JButton b17 = new JButton();

        Calculator() {
            jF.setLocation(0, 0);
            jF.setSize(500, 500);
            jF.setLayout((LayoutManager)null);
           jF.setVisible(true);
            jF.add(tf1);
            jF.add(b1);
            jF.add(b1);
            jF.add(b2);


            this.tf1.setBounds(50, 40, 300, 50);
            this.b1.setBounds(50, 120, 50, 50);
            this.b1.setText("1");
            this.b2.setBounds(130, 120, 50, 50);
            this.b2.setText("2");
            this.b3.setBounds(210, 120, 50, 50);
            this.b3.setText("3");
            this.b4.setBounds(290, 100, 50, 40);
            this.b4.setText("C");
            this.b5.setBounds(50, 200, 50, 50);
            this.b5.setText("4");
            this.b6.setBounds(130, 200, 50, 50);
            this.b6.setText("5");
            this.b7.setBounds(210, 200, 50, 50);
            this.b7.setText("6");
            this.b8.setBounds(290, 170, 50, 40);
            this.b8.setText("+");
            this.b9.setBounds(50, 280, 50, 50);
            this.b9.setText("7");
            this.b10.setBounds(130, 280, 50, 50);
            this.b10.setText("8");
            this.b11.setBounds(210, 280, 50, 50);
            this.b11.setText("9");
            this.b12.setBounds(290, 240, 50, 40);
            this.b12.setText("-");
            this.b13.setBounds(50, 360, 50, 50);
            this.b13.setText(".");
            this.b14.setBounds(130, 360, 50, 50);
            this.b14.setText("0");
            this.b15.setBounds(210, 360, 50, 50);
            this.b15.setText("=");
            this.b16.setBounds(290, 310, 50, 40);
            this.b16.setText("*");
            this.b17.setBounds(290, 380, 50, 40);
            this.b17.setText("/");
            this.b1.addActionListener(this);
            this.b2.addActionListener(this);
            this.b3.addActionListener(this);
            this.b4.addActionListener(this);
            this.b5.addActionListener(this);
            this.b6.addActionListener(this);
            this.b7.addActionListener(this);
            this.b8.addActionListener(this);
            this.b9.addActionListener(this);
            this.b10.addActionListener(this);
            this.b11.addActionListener(this);
            this.b12.addActionListener(this);
            this.b13.addActionListener(this);
            this.b14.addActionListener(this);
            this.b15.addActionListener(this);
            this.b16.addActionListener(this);
            this.b17.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {
            int n = 0;
            int m = 0;
            char op = 0;
            int result = 0;
            String s;
            String s1;
            if (e.getSource() == this.b1) {
                s1 = this.tf1.getText();
                s = s1 + "1";
                this.tf1.setText(s);
            }

            if (e.getSource() == this.b2) {
                s1 = this.tf1.getText();
                s = s1 + "2";
                this.tf1.setText(s);
            }

            if (e.getSource() == this.b3) {
                s1 = this.tf1.getText();
                s = s1 + "3";
                this.tf1.setText(s);
            }

            if (e.getSource() == this.b4) {
                this.tf1.setText("");
            }

            if (e.getSource() == this.b5) {
                s1 = this.tf1.getText();
                s = s1 + "4";
                this.tf1.setText(s);
            }

            if (e.getSource() == this.b6) {
                s1 = this.tf1.getText();
                s = s1 + "5";
                this.tf1.setText(s);
            }

            if (e.getSource() == this.b7) {
                s1 = this.tf1.getText();
                s = s1 + "6";
                this.tf1.setText(s);
            }

            if (e.getSource() == this.b8) {
                n = Integer.parseInt(this.tf1.getText());
                this.tf1.setText("" + n + "+");
                op = 43;
            }

            if (e.getSource() == this.b9) {
                s1 = this.tf1.getText();
                s = s1 + "7";
                this.tf1.setText(s);
            }

            if (e.getSource() == this.b10) {
                s1 = this.tf1.getText();
                s = s1 + "8";
                this.tf1.setText(s);
            }

            if (e.getSource() == this.b11) {
                s1 = this.tf1.getText();
                s = s1 + "9";
                this.tf1.setText(s);
            }

            if (e.getSource() == this.b12) {
                n = Integer.parseInt(this.tf1.getText());
                this.tf1.setText("" + n + "-");
                op = 45;
            }

            if (e.getSource() == this.b13) {
                this.tf1.setText("");
            }

            if (e.getSource() == this.b14) {
                s1 = this.tf1.getText();
                s = s1 + "0";
                this.tf1.setText(s);
            }

            if (e.getSource() == this.b16) {
                n = Integer.parseInt(this.tf1.getText());
                this.tf1.setText("" + n + "*");
                op = 42;
            }

            if (e.getSource() == this.b17) {
                n = Integer.parseInt(this.tf1.getText());
                this.tf1.setText("" + n + "/");
            }

            int i;
            if (e.getSource() == this.b15) {
                s1 = this.tf1.getText();
                int x = 0;

                for(i = 0; i != op; x = i++) {
                    n = Integer.parseInt(s1);
                }

                String c = Integer.toString(n);
                i = x + 1;

                for(i = x + 1; i <= s1.length(); ++i) {
                    m = Integer.parseInt(s1);
                }

                String d = Integer.toString(m);
                if (op == 43) {
                    result = Integer.parseInt(c) + Integer.parseInt(d);
                } else if (op == 45) {
                    result = Integer.parseInt(c) - Integer.parseInt(d);
                } else if (op == 42) {
                    result = Integer.parseInt(c) * Integer.parseInt(d);
                } else if (op == 47) {
                    result = Integer.parseInt(c) / Integer.parseInt(d);
                }

                System.out.println(result);
                this.tf1.setText(String.valueOf(result));
            }

            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();
            i = sc.nextInt();
            char c = sc.next().charAt(0);
            this.tf1.setText(String.valueOf(i + c + i));

        }
    }

}
