// package atm;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ATM implements ActionListener {
    int password = 12345, i, wamount, damount, balance;
    JButton b, bw, bd, bc, blogin, back;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
    Label actions = new Label("");
    Label l2 = new Label();
    Label l3 = new Label();
    Label lATM = new Label();
    Label errorm = new Label();
    Panel panel, p111;
    TextField tf;
    JFrame jf = new JFrame();

    ATM() {
        login();
        jf.setLayout(null);
        jf.setTitle("ATM");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setSize(400, 480);
    }

    public void login() {
        panel = new Panel();
        panel.setBounds(80, 80, 200, 200);
        panel.setBackground(Color.gray);
        lATM.setText("Insert your ATM then enter Password");
        lATM.setBounds(80, 20, 300, 50);
        Label l2 = new Label("Enter your password");
        tf = new TextField(20);
        blogin = new JButton("Enter");
        errorm = new Label("");

        jf.add(lATM);
        panel.add(l2);
        panel.add(tf);
        panel.add(blogin);
        panel.add(errorm);
        blogin.addActionListener(this);
        panel.setVisible(true);
        jf.add(panel);
        jf.repaint();
    }

    public void welcome() {
        panel.removeAll();
        jf.remove(errorm); // To remove error msg
        panel = new Panel();
        panel.setBounds(80, 80, 200, 280);
        panel.setBackground(Color.gray);

        Label welcomee = new Label("Welcome to ATM");
        welcomee.setBounds(1, 1, 200, 30);
        errorm = new Label("");
        errorm.setBounds(1, 40, 200, 30);
        actions = new Label(" ");
        Label w1 = new Label("1.Withdraw");
        Label w2 = new Label("2.Deposit");
        Label w3 = new Label("3.Check Balance");
        Label w4 = new Label("4.Exit");
        tf = new TextField(20);
        b = new JButton("Submit");

        jf.add(welcomee);
        jf.add(errorm);
        panel.add(actions);
        panel.add(w1);
        panel.add(w2);
        panel.add(w3);
        panel.add(w4);
        panel.add(tf);
        panel.add(b);

        p111 = new Panel();
        p111.setBounds(130, 230, 100, 110);
        p111.setBackground(Color.gray);
        b1 = new Button(" 1 ");
        b2 = new Button(" 2 ");
        b3 = new Button(" 3 ");
        b4 = new Button(" 4 ");
        b5 = new Button(" 5 ");
        b6 = new Button(" 6 ");
        b7 = new Button(" 7 ");
        b8 = new Button(" 8 ");
        b9 = new Button(" 9 ");
        b10 = new Button(" 0 ");
        b11 = new Button(" <- ");
        p111.add(b1);
        p111.add(b2);
        p111.add(b3);
        p111.add(b4);
        p111.add(b5);
        p111.add(b6);
        p111.add(b7);
        p111.add(b8);
        p111.add(b9);
        p111.add(b10);
        p111.add(b11);
        p111.setVisible(true);
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
        jf.add(p111);

        b.addActionListener(this);
        jf.add(panel);
        jf.repaint();

    }

    public void withdraw() {
        panel.removeAll();
        jf.remove(errorm); // To remove error msg
        panel = new Panel();
        panel.setBounds(80, 80, 200, 280);
        panel.setBackground(Color.gray);
        Label l1 = new Label("Enter amount to withdraw");
        tf = new TextField(20);
        bw = new JButton("Enter");
        back = new JButton("Back");
        l2.setText("");
        l3.setText("");

        panel.add(l1);
        panel.add(tf);
        panel.add(bw);
        panel.add(back);
        panel.add(l2);
        panel.add(l3);
        jf.add(panel);
        panel.setVisible(true);
        back.addActionListener(this);
        bw.addActionListener(this);
        jf.add(panel);
        jf.repaint();

    }

    public void Deposit() {
        panel.removeAll();
        jf.remove(errorm); // To remove error msg
        panel = new Panel();
        panel.setBounds(80, 80, 200, 280);
        panel.setBackground(Color.gray);
        Label l1 = new Label("Enter amount to Deposite");
        tf = new TextField(20);
        bd = new JButton("Enter");
        back = new JButton("Back");
        l2.setText("");
        l3.setText("");

        panel.add(l1);
        panel.add(tf);
        panel.add(bd);
        panel.add(back);
        panel.add(l2);
        panel.add(l3);
        jf.add(panel);
        panel.setVisible(true);
        back.addActionListener(this);
        bd.addActionListener(this);
        jf.add(panel);

    }

    public void CheckBal() {
        jf.remove(errorm); // To remove error msg
        p111.removeAll();
        panel = new Panel();
        panel.setBounds(80, 80, 210, 280);
        panel.setBackground(Color.gray);
        back = new JButton("Back");

        panel.add(l2);
        panel.add(back);
        jf.add(panel);
        panel.setVisible(true);
        back.addActionListener(this);
        jf.repaint();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            // TRANSICTION ACTIONS
            String a = tf.getText();
            i = Integer.parseInt(a);
            actions.setText("" + i + "");
            if (i == 1) {
                jf.remove(panel);
                withdraw();
                jf.repaint();
                jf.setSize(400, 480);
            } else if (i == 2) {
                jf.remove(panel);
                Deposit();
                jf.repaint();
            } else if (i == 3) {
                jf.remove(panel);
                CheckBal();
                l2.setText("Your Available Balance is Rs." + balance + "");
                jf.repaint();

            } else if (i == 4) {
                jf.dispose();
            } else {
                errorm.setText("Enter valid Choice");
            }
            jf.setSize(400, 480);
        }
        if (e.getSource() == blogin) {

            String str = tf.getText();
            int pass = Integer.parseInt(str);
            if (pass == password) {
                jf.remove(panel);
                jf.remove(lATM);
                System.out.print("Authentication Successfull.");
                welcome();
            } else {

                errorm.setText("Please Enter correct password");
            }

        }
        if (e.getSource() == bw) {
            String a = tf.getText();
            i = Integer.parseInt(a);
            if (balance > i) {
                balance = balance - i;
                System.out.println(balance);
                l2.setText(" Please collect your cash Rs." + i + "");
                l3.setText("Available balance is Rs." + balance + "");
                jf.setSize(400, 400);
                System.out.print(" Please collect your cash");
                jf.repaint();
            } else {
                l2.setText("You can't withdraw..!!");
                l3.setText(" Your balance is Rs." + balance);
                System.out.print("You can't deposite!! Your balance is " + balance);
                jf.repaint();
            }

        }
        if (e.getSource() == bd) {
            String a = tf.getText();
            i = Integer.parseInt(a);
            balance = balance + i;
            System.out.println(balance);
            l2.setText(" " + i + " Deposit Sucessfull..!");
            l3.setText("Available balance is Rs." + balance + "");
            System.out.print("Deposit Sucessfull..!");
            jf.repaint();
        }
        if (e.getSource() == back) {
            jf.remove(panel);
            jf.remove(p111);
            welcome();
            jf.setVisible(false);
            jf.setVisible(true);
            System.out.print("Back success");
            jf.repaint();
        }

        // Conditions for Keypad Buttons
        if (e.getSource() == b1) {
            String ee = tf.getText();
            tf.setText("" + ee + 1);
        }
        if (e.getSource() == b2) {
            String ee = tf.getText();
            tf.setText("" + ee + 2);
        }
        if (e.getSource() == b3) {
            String ee = tf.getText();
            tf.setText("" + ee + 3);
        }
        if (e.getSource() == b4) {
            String ee = tf.getText();
            tf.setText("" + ee + 4);
        }
        if (e.getSource() == b5) {
            String ee = tf.getText();
            tf.setText("" + ee + 5);
        }
        if (e.getSource() == b6) {
            String ee = tf.getText();
            tf.setText("" + ee + 6);
        }
        if (e.getSource() == b7) {
            String ee = tf.getText();
            tf.setText("" + ee + 7);
        }
        if (e.getSource() == b8) {
            String ee = tf.getText();
            tf.setText("" + ee + 8);
        }
        if (e.getSource() == b9) {
            String ee = tf.getText();
            tf.setText("" + ee + 9);
        }
        if (e.getSource() == b10) {
            String ee = tf.getText();
            tf.setText("" + ee + 0);
        }
        if (e.getSource() == b11) {
            tf.setText("");
        }
        // Keypad conditions Closes
    }

    public static void main(String[] args) {
        new ATM();
    }
}