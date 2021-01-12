package company.com;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transcations  implements ActionListener{

    JLabel selectTrancl;
    JButton depsoitb,cashWithdrawb,fastcashb,ministateb,pinchangeb,balanceQueryb,exitb,accountDetail;
    JFrame frame;
    JPanel panel;
Database Databses = new Database();
    Transcations(){
        frame = new JFrame("TRANSACTION");
        panel = new JPanel();

    
        selectTrancl = new JLabel("Please Select Your Transaction");
        selectTrancl.setFont(new Font("System", Font.BOLD, 38));
        selectTrancl.setForeground(Color.BLACK);
    
       
        depsoitb = new JButton("DEPOSIT");
        depsoitb.setFont(new Font("System", Font.BOLD, 18));
        depsoitb.setBackground(Color.WHITE);
        depsoitb.setForeground(Color.BLACK);
    
        cashWithdrawb = new JButton("CASH WITHDRAWL");
        cashWithdrawb.setFont(new Font("System", Font.BOLD, 18));
        cashWithdrawb.setBackground(Color.WHITE);
        cashWithdrawb.setForeground(Color.BLACK);
        
        fastcashb = new JButton("FAST CASH");
        fastcashb.setFont(new Font("System", Font.BOLD, 18));
        fastcashb.setBackground(Color.WHITE);
        fastcashb.setForeground(Color.BLACK);
        
        ministateb = new JButton("MINI STATEMENT");
        ministateb.setFont(new Font("System", Font.BOLD, 18));
        ministateb.setBackground(Color.WHITE);
        ministateb.setForeground(Color.BLACK);
        
        pinchangeb = new JButton("PIN CHANGE");
        pinchangeb.setFont(new Font("System", Font.BOLD, 18));
        pinchangeb.setBackground(Color.WHITE);
        pinchangeb.setForeground(Color.BLACK);
        
        balanceQueryb = new JButton("BALANCE ENQUIRY");
        balanceQueryb.setFont(new Font("System", Font.BOLD, 18));
        balanceQueryb.setBackground(Color.WHITE);
        balanceQueryb.setForeground(Color.BLACK);

        accountDetail = new JButton("ACCOUNT DETAILS");
        accountDetail.setFont(new Font("System", Font.BOLD, 18));
        accountDetail.setBackground(Color.WHITE);
        accountDetail.setForeground(Color.BLACK);


        exitb = new JButton("EXIT");
        exitb.setFont(new Font("System", Font.BOLD, 18));
        exitb.setBackground(Color.WHITE);
        exitb.setForeground(Color.BLACK);
        
        
        panel.setLayout(null);
        
        selectTrancl.setBounds(100,100,700,40);
        panel.add(selectTrancl);
        
        depsoitb.setBounds(40,250,300,60);
        panel.add(depsoitb);
        
        cashWithdrawb.setBounds(440,250,300,60);
        panel.add(cashWithdrawb);
        
        fastcashb.setBounds(40,360,300,60);
        panel.add(fastcashb);
        
        ministateb.setBounds(440,360,300,60);
        panel.add(ministateb);
        
        pinchangeb.setBounds(40,470,300,60);
        panel.add(pinchangeb);
        
        balanceQueryb.setBounds(440,470,300,60);
        panel.add(balanceQueryb);

        accountDetail.setBounds(40,580,300,60);
        panel.add(accountDetail);

        exitb.setBounds(440,580,300,60);
        panel.add(exitb);
        
        
        depsoitb.addActionListener(this);
        cashWithdrawb.addActionListener(this);
        fastcashb.addActionListener(this);
        ministateb.addActionListener(this);
        pinchangeb.addActionListener(this);
        balanceQueryb.addActionListener(this);
        exitb.addActionListener(this);
        accountDetail.addActionListener(this);


        ImageIcon background =new ImageIcon("stoc.jpg");
        JLabel label = new JLabel();
        label.setBounds(0, 0, 1200, 800);
        label.setIcon(background);
        panel.setLayout(null);
        panel.add(label);



        frame.add(panel);
        panel.setBackground(Color.BLACK);
        frame.setSize(800,800);
        frame.setLocation(350,20);

        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == depsoitb) {
            new Deposit().panel.setVisible(true);
            frame.dispose();

        } else if (ae.getSource() == cashWithdrawb) {
            new Withdrawl().panel.setVisible(true);
            frame.dispose();

        } else if (ae.getSource() == fastcashb) {
            new FastCash().panel.setVisible(true);
            frame.dispose();
        } else if (ae.getSource() == ministateb) {
            new MiniStatement().panel.setVisible(true);
            frame.dispose();
        }
        else if (ae.getSource() == balanceQueryb) {
            String pinn = JOptionPane.showInputDialog("Enter PIN");
            try {
                ResultSet rs = Databses.s.executeQuery("select * from bank where pin = '" + pinn + "'");
                while (rs.next()) {
                    double balance = rs.getDouble("balance");
                    JOptionPane.showMessageDialog(null, "Your Account Balance is " + balance);

                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (ae.getSource() == pinchangeb) {
            new Pin().panel.setVisible(true);
            frame.dispose();
        }
        else if(ae.getSource() == accountDetail){
            new AccountInfo().panel.setVisible(true);
            frame.dispose();
        }
        else if(ae.getSource()==exitb){
            System.exit(0);
        }
    }
    public static void main(String[] args){
        new Transcations();
    }
}