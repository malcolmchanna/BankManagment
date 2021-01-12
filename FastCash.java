package company.com;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class FastCash extends Transcations implements ActionListener{

    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JFrame frame;
    JPanel panel;
    Database Database = new Database();

    FastCash() {
        frame = new JFrame("FAST CASH");
        panel = new JPanel();

        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setFont(new Font("System", Font.BOLD, 38));

        b1 = new JButton("Rs 100");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("Rs 500");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        b3 = new JButton("Rs 1000");
        b3.setFont(new Font("System", Font.BOLD, 18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);

        b4 = new JButton("Rs 2000");
        b4.setFont(new Font("System", Font.BOLD, 18));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);

        b5 = new JButton("Rs 5000");
        b5.setFont(new Font("System", Font.BOLD, 18));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);

        b6 = new JButton("Rs 10000");
        b6.setFont(new Font("System", Font.BOLD, 18));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);

        b7 = new JButton("BACK");
        b7.setFont(new Font("System", Font.BOLD, 18));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);

        b7 = new JButton("EXIT");
        b7.setFont(new Font("System", Font.BOLD, 18));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);

        panel.setLayout(null);
        l1.setBounds(100, 100, 700, 40);
        panel.add(l1);

        b1.setBounds(40, 250, 300, 60);
        panel.add(b1);

        b2.setBounds(440, 250, 300, 60);
        panel.add(b2);

        b3.setBounds(40, 360, 300, 60);
        panel.add(b3);

        b4.setBounds(440, 360, 300, 60);
        panel.add(b4);

        b5.setBounds(40, 470, 300, 60);
        panel.add(b5);

        b6.setBounds(440, 470, 300, 60);
        panel.add(b6);

        b7.setBounds(240, 600, 300, 60);
        panel.add(b7);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        ImageIcon background =new ImageIcon("photo-1593005510329-8a4035a7238f.jpg");
        JLabel label = new JLabel();
        label.setBounds(0, 0, 1200, 700);
        label.setIcon(background);
        panel.setLayout(null);
        panel.add(label);


        frame.add(panel);
        frame.setSize(800,730);
        frame.setLocation(350,20);

        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
            try{
                String a =JOptionPane.showInputDialog(null,"Enter Your Pin");
                double balance = 0;
                SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date da = new Date();
                String DATES = f.format(da);
                if(ae.getSource()==b1) {
                ResultSet rs = Database.s.executeQuery(" select * from bank where pin = '" + a + "' ");
                if (rs.next()) {
                    String pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    balance -= 100;
                    String q1 = "update bank set withdraw = '" + 100 +"' where pin = '" + pin + "' ";
                    String q12 = "update bank set balance = '" + balance +"' where pin = '" + pin + "' ";
                    String q13 = "update bank set Date = '" + DATES +"' where pin = '" + pin + "' ";
                    String q14 = "update bank set  deposit = '" + null +"' where pin = '" + pin + "' ";
                    Database.s.executeUpdate(q1);
                    Database.s.executeUpdate(q12);
                    Database.s.executeUpdate(q13);
                    Database.s.executeUpdate(q14);
                }
                JOptionPane.showMessageDialog(null, "Rs. " + 100 + " Debited Successfully");
                new Transcations().panel.setVisible(true);
                frame.dispose();
            }
            else if(ae.getSource()==b2){
                    ResultSet rs = Database.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        balance = rs.getDouble("balance");
                        balance-=500;
                        String q1= "insert into bank values('"+pin+"',null,500,'"+balance+"')";
                        Database.s.executeUpdate(q1);
                    }
                    JOptionPane.showMessageDialog(null, "Rs. "+500+" Debited Successfully");
                    new Transcations().panel.setVisible(true);
                    frame.dispose();
                }
            else if(ae.getSource()==b3){
                    ResultSet rs = Database.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        balance = rs.getDouble("balance");
                        balance-=1000;
                        String q1 = "update bank set withdraw = '" + 1000 +"' where pin = '" + pin + "' ";
                        String q12 = "update bank set balance = '" + balance +"' where pin = '" + pin + "' ";
                        String q13 = "update bank set Date = '" + DATES +"' where pin = '" + pin + "' ";
                        String q14 = "update bank set  deposit = '" + null +"' where pin = '" + pin + "' ";
                        Database.s.executeUpdate(q1);
                        Database.s.executeUpdate(q12);
                        Database.s.executeUpdate(q13);
                        Database.s.executeUpdate(q14);
                    }
                    JOptionPane.showMessageDialog(null, "Rs. "+1000+" Debited Successfully");
                    new Transcations().panel.setVisible(true);
                frame.dispose();
                }
            else if(ae.getSource()==b4){
                    ResultSet rs = Database.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        balance = rs.getDouble("balance");
                        balance-=2000;
                        String q1 = "update bank set withdraw = '" + 2000 +"' where pin = '" + pin + "' ";
                        String q12 = "update bank set balance = '" + balance +"' where pin = '" + pin + "' ";
                        String q13 = "update bank set Date = '" + DATES +"' where pin = '" + pin + "' ";
                        String q14 = "update bank set  deposit = '" + null +"' where pin = '" + pin + "' ";
                        Database.s.executeUpdate(q1);
                        Database.s.executeUpdate(q12);
                        Database.s.executeUpdate(q13);
                        Database.s.executeUpdate(q14);
                      }
                    JOptionPane.showMessageDialog(null, "Rs. "+2000+" Debited Successfully");
                    new Transcations().panel.setVisible(true);
                frame.dispose();
            }
            else if(ae.getSource()==b5){
                    ResultSet rs = Database.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        balance = rs.getDouble("balance");
                        balance-=5000;
                        String q1 = "update bank set withdraw = '" + 5000 +"' where pin = '" + pin + "' ";
                        String q12 = "update bank set balance = '" + balance +"' where pin = '" + pin + "' ";
                        String q13 = "update bank set Date = '" + DATES +"' where pin = '" + pin + "' ";
                        String q14 = "update bank set  deposit = '" + null +"' where pin = '" + pin + "' ";
                        Database.s.executeUpdate(q1);
                        Database.s.executeUpdate(q12);
                        Database.s.executeUpdate(q13);
                        Database.s.executeUpdate(q14);}
                    JOptionPane.showMessageDialog(null, "Rs. "+5000+" Debited Successfully");
                    new Transcations().panel.setVisible(true);
                frame.dispose();
            }
            else if(ae.getSource()==b6){
                    ResultSet rs = Database.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        balance = rs.getDouble("balance");
                        balance-=10000;
                        String q1 = "update bank set withdraw = '" + 10000 +"' where pin = '" + pin + "' ";
                        String q12 = "update bank set balance = '" + balance +"' where pin = '" + pin + "' ";
                        String q13 = "update bank set Date = '" + DATES +"' where pin = '" + pin + "' ";
                        String q14 = "update bank set  deposit = '" + null +"' where pin = '" + pin + "' ";
                        Database.s.executeUpdate(q1);
                        Database.s.executeUpdate(q12);
                        Database.s.executeUpdate(q13);
                        Database.s.executeUpdate(q14);}
                    JOptionPane.showMessageDialog(null, "Rs. "+10000+" Debited Successfully");
                    new Transcations().panel.setVisible(true);
                    frame.dispose();
                }
            else if(ae.getSource()==b7){
                System.exit(0);
            }
        }catch(Exception e){
                e.printStackTrace();
                System.out.println("error: "+e);
        }
            
    }
    public static void main(String[] args){
        new FastCash();
    }
}