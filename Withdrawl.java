package company.com;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import static javax.swing.JOptionPane.*;

public class Withdrawl extends Transcations implements ActionListener{
    
    JTextField withdrawtf;
    JButton withdrawb,backb,exitb;
    JLabel maxWithdrawl,rsl,enteramountl;
    JFrame frame ;
    JPanel panel;
    
    
    public static final int INSUFFICIENT_BALANCE=1;
    public static final int WITHDRAWAL_LIMIT_UNDER=2;
    public static final int WITHDRAWAL_LIMIT_OVER=3;
    Database database = new Database();

    Withdrawl(){
        
         frame = new JFrame("WITHDRAWAL");
         panel = new JPanel();
        
        
        maxWithdrawl = new JLabel("MAXIMUM DAILY WITHDRAWAL");
        maxWithdrawl.setFont(new Font("System", Font.BOLD, 40));
        
        rsl = new JLabel("IS RS.10,000");
        rsl.setFont(new Font("System", Font.BOLD, 40));
        
        enteramountl = new JLabel("PLEASE ENTER YOUR AMOUNT");
        enteramountl.setFont(new Font("System", Font.BOLD, 35));
        

        withdrawtf = new JTextField();
        withdrawtf.setFont(new Font("Raleway", Font.BOLD, 22));
        

        withdrawb = new JButton("WITHDRAW");
        withdrawb.setFont(new Font("System", Font.BOLD, 18));
        withdrawb.setBackground(Color.BLACK);
        withdrawb.setForeground(Color.WHITE);
    
        backb = new JButton("BACK");
        backb.setFont(new Font("System", Font.BOLD, 18));
        backb.setBackground(Color.BLACK);
        backb.setForeground(Color.WHITE);
        
        exitb = new JButton("EXIT");
        exitb.setFont(new Font("System", Font.BOLD, 18));
        exitb.setBackground(Color.BLACK);
        exitb.setForeground(Color.WHITE);
        
        
        panel.setLayout(null);
        


        maxWithdrawl.setBounds(90,100,800,60);
        panel.add(maxWithdrawl);
        
        rsl.setBounds(270,160,800,60);
        panel.add(rsl);
        
        enteramountl.setBounds(120,260,800,60);
        panel.add(enteramountl);
        enteramountl.setBackground(Color.black);
        
        withdrawtf.setBounds(210,340,360,50);
        panel.add(withdrawtf);
        
        withdrawb.setBounds(220,400,160,50);
        panel.add(withdrawb);
        
        backb.setBounds(400,400,160,50);
        panel.add(backb);
        
        exitb.setBounds(300,480,200,50);
        panel.add(exitb);

        withdrawb.addActionListener(this);
        backb.addActionListener(this);
        exitb.addActionListener(this);

        ImageIcon background =new ImageIcon("photo-1593005510329-8a4035a7238f.jpg");

        ;        JLabel label = new JLabel();
        label.setBounds(0, 0, 1200, 700);
        label.setIcon(background);
        panel.setLayout(null);
        panel.add(label);


        frame.add(panel);
        frame.setSize(800,700);
        frame.setLocation(350,20);
        frame.setVisible(true);
    }
    private  double balance = 2000;

    int withdrawMoney(double amount)
    {
        if(amount<500)
            return WITHDRAWAL_LIMIT_UNDER;
        if(amount>10000)
            return WITHDRAWAL_LIMIT_OVER;
        if(balance-amount<500)
            return INSUFFICIENT_BALANCE;
        balance-=amount;
        return 0;
    }

    public void actionPerformed(ActionEvent ae){
        try{
             String b = withdrawtf.getText();
             double t = withdrawMoney(Double.parseDouble(withdrawtf.getText()));
             if(ae.getSource()==withdrawb){
                if(withdrawtf.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdraw");
                }
                else if(t ==INSUFFICIENT_BALANCE)
                    JOptionPane.showMessageDialog(null,"You don't have enough Balance","Failed",JOptionPane.ERROR_MESSAGE);
                else if(t ==WITHDRAWAL_LIMIT_UNDER)
                    JOptionPane.showMessageDialog(null,"Minimum withdrawal amount is:500 " ,"Failed",JOptionPane.ERROR_MESSAGE);
                else if(t == WITHDRAWAL_LIMIT_OVER)
                    JOptionPane.showMessageDialog(null,"Maximum Withdrawal amount is:2000 " ,"Failed",JOptionPane.ERROR_MESSAGE);
                else{
                  String  a= JOptionPane.showInputDialog(null,"enter Pin code");
                    ResultSet rs = database.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                     double balance;
                    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    java.util.Date da = new Date();
                    String Dates = f.format(da);

                    if(rs.next()){
                        String pin = rs.getString("pin");
                        balance = rs.getDouble("balance");
                        double d = Double.parseDouble(b);
                        balance-=d;
                        String q1 = " update bank set withdraw = '" + b +"'    where pin = '" + pin + "' ";
                        String q12 = "update bank set date = '" + Dates+ "'  where pin = '" + pin + "' ";
                        String q13 = "update bank set balance = '" + balance+ "'  where pin = '" + pin + "' ";
                        String q14 = "update bank set deposit = '" + null+ "'  where pin = '" + pin + "' ";
                        database.s.executeUpdate(q14);
                        database.s.executeUpdate(q12);
                        database.s.executeUpdate(q1);
                        database.s.executeUpdate(q13);
                        JOptionPane.showMessageDialog(null, "Rs. "+b+" Debited Successfully");

                    }
                    new Transcations().panel.setVisible(true);
                    frame.dispose();
                }
            }else if(ae.getSource()==backb){
                
                new Transcations().panel.setVisible(true);
                frame.dispose();


            }else if(ae.getSource()==exitb){
                
                System.exit(0);
                
            }
        }catch(Exception e){
                e.printStackTrace();
                System.out.println("error: "+e);
        }
            
    }

    

    public static void main(String[] args){
        new Withdrawl();
    }
}
