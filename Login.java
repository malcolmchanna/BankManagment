package company.com;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JLabel welAtml,Cardnol,pinl;
    JTextField cardnotf;
    JPasswordField passwordpf;
    JButton signinB,ClearB,signupB;
    JFrame frame;
    JPanel panel;
    Database database = new Database();

    Login(){
        frame = new JFrame("AUTOMATED TELLER MACHINE");
        panel = new JPanel();


        welAtml = new JLabel("WELCOME TO ATM");
        welAtml.setFont(new Font("Osward", Font.BOLD, 45));

        Cardnol = new JLabel("Account No:");
        Cardnol.setFont(new Font("Raleway", Font.BOLD, 28));
        
        pinl = new JLabel("PIN:");
        pinl.setFont(new Font("Raleway", Font.BOLD, 28));
        
        cardnotf = new JTextField(15);
        passwordpf = new JPasswordField(15);
        
        signinB = new JButton("LOGIN");
        signinB.setBackground(Color.BLACK);
        signinB.setForeground(Color.WHITE);
        
        ClearB = new JButton("CLEAR");
        ClearB.setBackground(Color.BLACK);
        ClearB.setForeground(Color.WHITE);
        
        signupB = new JButton("CREATE ACCOUNT");
        signupB.setBackground(Color.BLACK);
        signupB.setForeground(Color.WHITE);

        panel.setLayout(null);

        welAtml.setBounds(195,50,450,200);

        panel.add(welAtml);
        
        Cardnol.setBounds(125,150,375,200);
        panel.add(Cardnol);
        
        cardnotf.setBounds(300,235,230,30);
        panel.add(cardnotf);
        
        pinl.setBounds(125,225,375,200);
        panel.add(pinl);
        
        cardnotf.setFont(new Font("Arial", Font.BOLD, 14));
       
        
        passwordpf.setFont(new Font("Arial", Font.BOLD, 14));
        passwordpf.setBounds(300,310,230,30);
        panel.add(passwordpf);
        
        signinB.setFont(new Font("Arial", Font.BOLD, 14));
        signinB.setBounds(300,400,100,30);
        panel.add(signinB);
        
        ClearB.setFont(new Font("Arial", Font.BOLD, 14));
        ClearB.setBounds(430,400,100,30);
        panel.add(ClearB);
        
        signupB.setFont(new Font("Arial", Font.BOLD, 14));
        signupB.setBounds(300,450,230,30);
        panel.add(signupB);
        
        
        signinB.addActionListener(this);
        ClearB.addActionListener(this);
        signupB.addActionListener(this);

        Color colorwhite = new Color(255, 255, 255);
        welAtml.setForeground(colorwhite);
        Cardnol.setForeground(colorwhite);
        pinl.setForeground(colorwhite);
        welAtml.setBackground(Color.black);

        ImageIcon background = new ImageIcon("login1.jpg") ;

        JLabel label = new JLabel();
        label.setBounds(0, 0, 750, 800);
        label.setIcon(background);
        panel.setLayout(null);
        panel.add(label);


        panel.setBackground(Color.black);
        frame.add(panel);
        frame.setSize(750,800);
        frame.setLocation(350,20);
        frame.setVisible(true);
        

        
    }
    public void actionPerformed(ActionEvent ae){
        try{
            String a  = cardnotf.getText();
            String b  = passwordpf.getText();
            String q  = "select * from login where cardno = '"+a+"' and pin = '"+b+"'";
            ResultSet rs = database.s.executeQuery(q);

            if(ae.getSource()==signinB){
                if(rs.next()){
                    new Transcations().panel.setVisible(true);
                    frame.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Password");
                    
                }
            }else if(ae.getSource()==ClearB){
                cardnotf.setText("");
                passwordpf.setText("");
            }else if(ae.getSource()==signupB){
                new Signup().Panel.setVisible(true);
                frame.dispose();

            }
        }catch(Exception e){
                    e.printStackTrace();
                    System.out.println("error: "+e);
        }
            
    }
    public static void main(String[] args){
        new Login();
    }

    
}



