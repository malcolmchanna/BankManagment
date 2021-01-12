package company.com;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener{
    
    JLabel accDetaill,acctypel,accnuml,xnuml,accl,checkbokl,pinl,xpinl,passl,servicel,formnol;
    JRadioButton savingrb,fixedepositrb,currentaccrb,r4;
    JButton sumbitb,caneclb;
    JCheckBox Atmcardcb,internetcb,mobilebankcb,emailalertcb,checkbokcb,estatementcb,lastgredl;
    JTextField t1;
    JFrame frame;
    JPanel panel;
    
    Database database = new Database();
    Signup signup;
    Signup3(){

        frame = new JFrame("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        panel = new JPanel();


        
        accDetaill = new JLabel("Page 3: Account Details");
        accDetaill.setFont(new Font("Raleway", Font.BOLD, 22));
        
        acctypel = new JLabel("Account Type:");
        acctypel.setFont(new Font("Raleway", Font.BOLD, 18));
        
        accnuml = new JLabel("Card Number:");
        accnuml.setFont(new Font("Raleway", Font.BOLD, 18));
        
        xnuml = new JLabel("XXXX-XXXX-XXXX-4184");
        xnuml.setFont(new Font("Raleway", Font.BOLD, 18));
        
        accl = new JLabel("(Your 16-digit Card number)");
        accl.setFont(new Font("Raleway", Font.BOLD, 12));
        
        checkbokl = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        checkbokl.setFont(new Font("Raleway", Font.BOLD, 12));
        
        pinl = new JLabel("PIN:");
        pinl.setFont(new Font("Raleway", Font.BOLD, 18));
        
        xpinl = new JLabel("XXXX");
        xpinl.setFont(new Font("Raleway", Font.BOLD, 18));
    
        passl = new JLabel("(4-digit password)");
        passl.setFont(new Font("Raleway", Font.BOLD, 12));
    
        servicel = new JLabel("Services Required:");
        servicel.setFont(new Font("Raleway", Font.BOLD, 18));

        formnol = new JLabel("Form No:");
        formnol.setFont(new Font("Raleway", Font.BOLD, 14));
        
        
        sumbitb = new JButton("Submit");
        sumbitb.setFont(new Font("Raleway", Font.BOLD, 14));
        sumbitb.setBackground(Color.BLACK);
        sumbitb.setForeground(Color.WHITE);
        
        caneclb = new JButton("Cancel");
        caneclb.setFont(new Font("Raleway", Font.BOLD, 14));
        caneclb.setBackground(Color.BLACK);
        caneclb.setForeground(Color.WHITE);
        
        
        Atmcardcb = new JCheckBox("ATM CARD");
        Atmcardcb.setBackground(Color.BLACK);
        Atmcardcb.setFont(new Font("Raleway", Font.BOLD, 16));
        
        internetcb = new JCheckBox("Internet Banking");
        internetcb.setBackground(Color.BLACK);
        internetcb.setFont(new Font("Raleway", Font.BOLD, 16));
        
        mobilebankcb = new JCheckBox("Mobile Banking");
        mobilebankcb.setBackground(Color.BLACK);
        mobilebankcb.setFont(new Font("Raleway", Font.BOLD, 16));
        
        emailalertcb = new JCheckBox("EMAIL Alerts");
        emailalertcb.setBackground(Color.BLACK);
        emailalertcb.setFont(new Font("Raleway", Font.BOLD, 16));
        
        checkbokcb = new JCheckBox("Cheque Book");
        checkbokcb.setBackground(Color.BLACK);
        checkbokcb.setFont(new Font("Raleway", Font.BOLD, 16));
        
        estatementcb = new JCheckBox("E-Statement");
        estatementcb.setBackground(Color.BLACK);
        estatementcb.setFont(new Font("Raleway", Font.BOLD, 16));
        
        lastgredl = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        lastgredl.setBackground(Color.BLACK);
        lastgredl.setFont(new Font("Raleway", Font.BOLD, 12));
         
        
        savingrb = new JRadioButton("Saving Account");
        savingrb.setFont(new Font("Raleway", Font.BOLD, 16));
        savingrb.setBackground(Color.BLACK);
        
        fixedepositrb = new JRadioButton("Fixed Deposit Account");
        fixedepositrb.setFont(new Font("Raleway", Font.BOLD, 16));
        fixedepositrb.setBackground(Color.BLACK);
        
        currentaccrb = new JRadioButton("Current Account");
        currentaccrb.setFont(new Font("Raleway", Font.BOLD, 16));
        currentaccrb.setBackground(Color.BLACK);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.BLACK);
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 12));
        
        
        
        
        panel.setLayout(null);
        
        formnol.setBounds(700,10,70,30);
        panel.add(formnol);
        
        t1.setBounds(770,10,40,30);
        panel.add(t1);
        
        accDetaill.setBounds(280,50,400,40);
        panel.add(accDetaill); 
        
        acctypel.setBounds(100,140,200,30);
        panel.add(acctypel);
        
        savingrb.setBounds(100,180,150,30);
        panel.add(savingrb);
        
        fixedepositrb.setBounds(350,180,300,30);
        panel.add(fixedepositrb);
        
        currentaccrb.setBounds(100,220,250,30);
        panel.add(currentaccrb);
        
        r4.setBounds(350,220,250,30);
        panel.add(r4);
        
        accnuml.setBounds(100,300,200,30);
        panel.add(accnuml);
        
        xnuml.setBounds(330,300,250,30);
        panel.add(xnuml);
        
        accl.setBounds(100,330,200,20);
        panel.add(accl);
        
        checkbokl.setBounds(330,330,500,20);
        panel.add(checkbokl);
        
        pinl.setBounds(100,370,200,30);
        panel.add(pinl);
        
        xpinl.setBounds(330,370,200,30);
        panel.add(xpinl);
        
        passl.setBounds(100,400,200,20);
        panel.add(passl);
        
        servicel.setBounds(100,450,200,30);
        panel.add(servicel);
        
        Atmcardcb.setBounds(100,500,200,30);
        panel.add(Atmcardcb);
        
        internetcb.setBounds(350,500,200,30);
        panel.add(internetcb);
        
        mobilebankcb.setBounds(100,550,200,30);
        panel.add(mobilebankcb);
        
        emailalertcb.setBounds(350,550,200,30);
        panel.add(emailalertcb);
        
        checkbokcb.setBounds(100,600,200,30);
        panel.add(checkbokcb);
        
        estatementcb.setBounds(350,600,200,30);
        panel.add(estatementcb);
        
        lastgredl.setBounds(100,680,600,20);
        panel.add(lastgredl);
        
        sumbitb.setBounds(300,720,100,30);
        panel.add(sumbitb);
        
        caneclb.setBounds(420,720,100,30);
        panel.add(caneclb);

        accDetaill.setForeground(Color.white);acctypel.setForeground(Color.white);
        accnuml.setForeground(Color.white);xnuml.setForeground(Color.white);
        accl.setForeground(Color.white);checkbokl.setForeground(Color.white);
        pinl.setForeground(Color.white);xpinl.setForeground(Color.white);
        passl.setForeground(Color.white);servicel.setForeground(Color.white);
        formnol.setForeground(Color.white);

        savingrb.setForeground(Color.white);
        fixedepositrb.setForeground(Color.white);
        currentaccrb.setForeground(Color.white);
        r4.setForeground(Color.white);
        Atmcardcb.setForeground(Color.white);internetcb.setForeground(Color.white);
        mobilebankcb.setForeground(Color.white);emailalertcb.setForeground(Color.white);checkbokcb.setForeground(Color.white);
        estatementcb.setForeground(Color.white);lastgredl.setForeground(Color.white);



        frame.add(panel);
        panel.setBackground(Color.BLACK);
        frame.setSize(830,800);
        frame.setLocation(350,20);
        frame.setVisible(true);
        
        sumbitb.addActionListener(this);
        caneclb.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        
        String a = null;
        if(savingrb.isSelected()){ 
            a = "Saving Account";
        }
        else if(fixedepositrb.isSelected()){ 
            a = "Fixed Deposit Account";
        }
        else if(currentaccrb.isSelected()){ 
            a = "Current Account";
        }else if(r4.isSelected()){ 
            a = "Recurring Deposit Account";
        }
        

        String b = "";
        if(Atmcardcb.isSelected()){ 
            b = b+" ATM Card";
        }
        if(internetcb.isSelected()){ 
            b = b+" Internet Banking";
        }
        if(mobilebankcb.isSelected()){ 
            b = b+" Mobile Banking";
        }
        if(emailalertcb.isSelected()){ 
            b = b+" EMAIL Alerts";
        }
        if(checkbokcb.isSelected()){ 
            b = b+" Cheque Book";
        }
        if(estatementcb.isSelected()){ 
            b = b+" E-Statement";
        }
        String c = t1.getText();

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000L;
        long first8 = Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        long first4 = Math.abs(first3);
        try{
            
            if(ae.getSource()==sumbitb){
                if(b.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                 try{
                     String q1 = "insert into signup3 values( '"+c+"', '"+a+"', '"+first8+"' , '"+first4+"', '"+b+"')";
                     String q2 = "insert into login values('"+first8+"','"+first4+"')";
                     String q3 = "insert into bank values('"+first4+"' ,null,null,null,null)";

                     database.s.executeUpdate(q1);
                     database.s.executeUpdate(q2);
                     database.s.executeUpdate(q3);
                     JOptionPane.showMessageDialog(null, "Card Number: " + first8 + "\n Pin:"+ first4);
                     new Deposit().panel.setVisible(true);
                     frame.dispose();
                 } catch (SQLException throwables) {
                     throwables.printStackTrace();
                 } catch (HeadlessException e) {
                     e.printStackTrace();
                 }
                }
            
            }else if(ae.getSource()==caneclb){
                System.exit(0);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new Signup3();
    }
    
}


