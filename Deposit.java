package company.com;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class Deposit extends Transcations implements ActionListener{
    
    JTextField deposittf;
    JButton depositb,backb,exitb;
    JLabel headb,todepositl;
    JFrame frame;
    JPanel panel;
  Database database = new Database();
    Deposit(){
        frame = new JFrame("DEPOSIT");
        panel =new JPanel();

        headb = new JLabel("ENTER AMOUNT YOU WANT");
        headb.setFont(new Font("System", Font.BOLD, 35));

        todepositl = new JLabel("TO DEPOSIT");
        todepositl.setFont(new Font("System", Font.BOLD, 35));


        deposittf = new JTextField();
        deposittf.setFont(new Font("Raleway", Font.BOLD, 22));


        depositb = new JButton("DEPOSIT");
        depositb.setFont(new Font("System", Font.BOLD, 18));
        depositb.setBackground(Color.BLACK);
        depositb.setForeground(Color.WHITE);

        backb = new JButton("BACK");
        backb.setFont(new Font("System", Font.BOLD, 18));
        backb.setBackground(Color.BLACK);
        backb.setForeground(Color.WHITE);

        exitb = new JButton("EXIT");
        exitb.setFont(new Font("System", Font.BOLD, 18));
        exitb.setBackground(Color.BLACK);
        exitb.setForeground(Color.WHITE);

        panel.setLayout(null);

        headb.setBounds(150,150,800,60);
        panel.add(headb);

        todepositl.setBounds(290,210,800,60);
        panel.add(todepositl);

        deposittf.setBounds(250,300,300,50);
        panel.add(deposittf);

        depositb.setBounds(260,380,125,50);
        panel.add(depositb);

        backb.setBounds(415,380,125,50);
        panel.add(backb);

        exitb.setBounds(300,450,200,50);
        panel.add(exitb);

        depositb.addActionListener(this);
        backb.addActionListener(this);
        exitb.addActionListener(this);

        todepositl.setBackground(Color.WHITE);
        headb.setBackground(Color.WHITE);

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

    public void actionPerformed(ActionEvent ae){
        try{
            String b = deposittf.getText();
            if(ae.getSource()==depositb){
                if(deposittf.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }
                else{
                 String a = JOptionPane.showInputDialog(" Enter PinCode");
                    double balance = 0;
                    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Date da = new Date();
                    String Dates = f.format(da);

                    ResultSet rs = database.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    if(rs.next()){
                        String pin = rs.getString("pin");
 						    balance = rs.getDouble("balance");
                        double d = Double.parseDouble(b);
                        balance+=d;
                        String q21 = "update bank set deposit = '" + b +"'    where pin = '" + pin + "' ";
                        String q11 = "update bank set balance = '" + balance+ "'  where pin = '" + pin + "' ";
                        String q12 = "update bank set date = '" + Dates+ "'  where pin = '" + pin + "' ";
                        String q13 = "update bank set  withdraw = '" + null+ "'  where pin = '" + pin + "' ";
                        database.s.executeUpdate(q12);
                        database.s.executeUpdate(q13);
                        database.s.executeUpdate(q21);
                        database.s.executeUpdate(q11);
                        JOptionPane.showMessageDialog(null, "Rs. "+b+" Deposited Successfully");
                    }
                    new Transcations().panel.setVisible(true);
                    frame.setVisible(false);
                }
                
            }else if(ae.getSource()==backb){
              new Transcations().panel.setVisible(true);
              frame.dispose();
            }
            else if(ae.getSource()==exitb){
                System.exit(0);
            }
        }catch(Exception e){
                e.printStackTrace();
                System.out.println("error: "+e);
        }
            
    }
    
    public static void main(String[] args){

        new Deposit();
    }

    
}
