/* Name : ADIBA KHANDAKER
ID: 011 231 0085
ASSIGNMENT 3;
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        jF.setLayout(null);
        jF.setVisible(true);
        jF.add(tf1);
        jF.add(b1);
        jF.add(b2);
        jF.add(b3);
        jF.add(b4);
        jF.add(b5);
        jF.add(b6);
        jF.add(b7);
        jF.add(b8);
        jF.add(b9);
        jF.add(b10);
        jF.add(b11);
        jF.add(b12);
        jF.add(b13);
        jF.add(b14);
        jF.add(b15);
        jF.add(b16);
        jF.add(b17);
        tf1.setBounds(50, 50, 300, 50);

        tf1.setEditable(true);  //(Only for user input)

        b1.setBounds(50, 120, 50, 50);
        b1.setText("1");
        b2.setBounds(130, 120, 50, 50);
        b2.setText("2");
        b3.setBounds(210, 120, 50, 50);
        b3.setText("3");
        b4.setBounds(290, 100, 50, 40);
        b4.setText("C");
        b5.setBounds(50, 200, 50, 50);
        b5.setText("4");
        b6.setBounds(130, 200, 50, 50);
        b6.setText("5");
        b7.setBounds(210, 200, 50, 50);
        b7.setText("6");
        b8.setBounds(290, 170, 50, 40);
        b8.setText("+");
        b9.setBounds(50, 280, 50, 50);
        b9.setText("7");
        b10.setBounds(130, 280, 50, 50);
        b10.setText("8");
        b11.setBounds(210, 280, 50, 50);
        b11.setText("9");
        b12.setBounds(290, 240, 50, 40);
        b12.setText("-");
        b13.setBounds(50, 360, 50, 50);
        b13.setText(".");
        b14.setBounds(130, 360, 50, 50);
        b14.setText("0");
        b15.setBounds(210, 360, 50, 50);
        b15.setText("=");
        b16.setBounds(290, 310, 50, 40);
        b16.setText("*");
        b17.setBounds(290, 380, 50, 40);
        b17.setText("/");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String s, s1;
        float m;
        float n;
        if (e.getSource() == b1) {
            s1 = tf1.getText();
            s = s1 + "1";
            tf1.setText(s);
        }
        if (e.getSource() == b2) {
            s1 = tf1.getText();
            s = s1 + "2";
            tf1.setText(s);
        }
        if (e.getSource() == b3) {
            s1 = tf1.getText();
            s = s1 + "3";
            tf1.setText(s);
        }
        if (e.getSource() == b4) {
            tf1.setText(" ");
        }
        if (e.getSource() == b5) {
            s1 = tf1.getText();
            s = s1 + "4";
            tf1.setText(s);
        }
        if (e.getSource() == b6) {
            s1 = tf1.getText();
            s = s1 + "5";
            tf1.setText(s);
        }
        if (e.getSource() == b7) {
            s1 = tf1.getText();
            s = s1 + "6";
            tf1.setText(s);
        }
        if (e.getSource() == b8) {
            n = Float.parseFloat(tf1.getText());
            tf1.setText(n + "+");
        }
        if (e.getSource() == b9) {
            s1 = tf1.getText();
            s = s1 + "7";
            tf1.setText(s);
        }
        if (e.getSource() == b10) {
            s1 = tf1.getText();
            s = s1 + "8";
            tf1.setText(s);
        }
        if (e.getSource() == b11) {
            s1 = tf1.getText();
            s = s1 + "9";
            tf1.setText(s);
        }
        if (e.getSource() == b12) {
            n = Float.parseFloat(tf1.getText());
            tf1.setText(n + "-");
        }
        boolean operatorPressed=false;
        boolean decimalPressed=false;
        if (e.getSource() == b13) {
            String text=tf1.getText();
            if(text.equals("+") || text.equals("-") || text.equals("*") || text.equals("/")) {
                operatorPressed=true;
            }
            if(operatorPressed) {
                text=" ";
                operatorPressed=false;
                decimalPressed=false;
            }
            if(!decimalPressed) {
                tf1.setText(text.concat("."));
                decimalPressed=true;
            }
        }
        if (e.getSource() == b14) {
            s1 = tf1.getText();
            s = s1 + "0";
            tf1.setText(s);
        }
        if (e.getSource() == b16) {
            n = Float.parseFloat(tf1.getText());
            tf1.setText(n + "*");


        }
        if (e.getSource() == b17) {
            n = Float.parseFloat(tf1.getText());
            tf1.setText(n + "/");

        }
        if (e.getSource() == b15) {
            try {
                String inputText = tf1.getText().trim();
                char operator = ' ';
                if (inputText.contains("+")) {
                    operator = '+';
                } else if (inputText.contains("-")) {
                    operator = '-';
                } else if (inputText.contains("*")) {
                    operator = '*';
                } else if (inputText.contains("/")) {
                    operator = '/';
                } else {
                    tf1.setText("Error: No valid operator found");
                    return;
                }
                String[] numbers = inputText.split("\\" + operator);

                if (numbers.length != 2) {
                    tf1.setText("Error: No valid number found");
                    return;
                }
                m = Float.parseFloat(numbers[0].trim());
                n = Float.parseFloat(numbers[1].trim());
                float result = 0;
                switch (operator) {
                    case '+':
                        result = m + n;
                        break;
                    case '-':
                        result = m - n;
                        break;
                    case '*':
                        result = m * n;
                        break;
                    case '/':
                        if (n == 0) {
                            tf1.setText("Error: Divide by zero");
                            return;
                        }
                        result = m / n;
                        break;
                }
                tf1.setText(String.valueOf(result));
                System.out.println(result);
            } catch (NumberFormatException nfe) {
                tf1.setText("Error: No valid number found");
            }

        }
    }

}


