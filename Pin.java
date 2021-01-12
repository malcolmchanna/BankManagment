
package company.com;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

public class Pin extends JFrame implements ActionListener{
    
    JPasswordField oldpintf,newPintf,re_pintf;
    JButton b1,b2;                               
    JLabel changeUrPinl,oldpinl,NewPinl,Re_pinl;
    JFrame frame;
    JPanel panel;
    String oldPasswordCheck ;
    Database Database = new Database();
    Pin(){
        frame = new JFrame("PIN CHANGE");
        panel = new JPanel();

        changeUrPinl = new JLabel("CHANGE YOUR PIN");
        changeUrPinl.setFont(new Font("System", Font.BOLD, 35));
        
        oldpinl = new JLabel("Current PIN:");
        oldpinl.setFont(new Font("System", Font.BOLD, 22));
        
        NewPinl = new JLabel("New PIN:");
        NewPinl.setFont(new Font("System", Font.BOLD, 22));
        
        Re_pinl = new JLabel("Re-Enter New PIN:");
        Re_pinl.setFont(new Font("System", Font.BOLD, 22));
        
        oldpintf = new JPasswordField();
        oldpintf.setFont(new Font("Raleway", Font.BOLD, 22));
        
        newPintf = new JPasswordField();
        newPintf.setFont(new Font("Raleway", Font.BOLD, 22));
        
        re_pintf = new JPasswordField();
        re_pintf.setFont(new Font("Raleway", Font.BOLD, 22));
        
        b1 = new JButton("SAVE");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
    
        b2 = new JButton("BACK");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        panel.setLayout(null);
        
        changeUrPinl.setBounds(220,130,800,60);
        panel.add(changeUrPinl);
        
        oldpinl.setBounds(100,240,150,40);
        panel.add(oldpinl);
        
        NewPinl.setBounds(100,300,150,40);
        panel.add(NewPinl);
        
        Re_pinl.setBounds(100,360,200,40);
        panel.add(Re_pinl);
        
        oldpintf.setBounds(310,240,300,40);
        panel.add(oldpintf);
        
        newPintf.setBounds(310,300,300,40);
        panel.add(newPintf);
        
        re_pintf.setBounds(310,360,300,40);
        panel.add(re_pintf);
        
        b1.setBounds(220,460,160,50);
        panel.add(b1);
        
        b2.setBounds(400,460,160,50);
        panel.add(b2);


        ImageIcon background =new ImageIcon("photo-1593005510329-8a4035a7238f.jpg");
        JLabel label = new JLabel();
        label.setBounds(0, 0, 1200, 700);
        label.setIcon(background);
        panel.setLayout(null);
        panel.add(label);


        panel.setBackground(new Color(34,34,34,34));
        frame.add(panel);
        frame.setSize(700,700);
        frame.setLocation(350,20);

        frame.setVisible(true);

    }
    
    public void actionPerformed(ActionEvent ae){
        try {
             String q1= "select * from login";
             ResultSet rs = Database.s.executeQuery(q1);
              while (rs.next()){
               oldPasswordCheck = rs.getString("pin");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            if (oldpintf.getText().isEmpty() || newPintf.getText().isEmpty() || re_pintf.getText().isEmpty()) {
                showMessageDialog(this, "Please Fill all the Fields", "Failed", ERROR_MESSAGE);
            } else if (!newPintf.getText().equals(re_pintf.getText())) {
                showMessageDialog(this, "New PINs doesn't Match", "Failed", ERROR_MESSAGE);
            } else if (newPintf.getText().equals(re_pintf.getText())) {
                if(oldpintf.getText().equals(oldPasswordCheck)){
                    String pass1 = String.valueOf(oldpintf.getPassword());
                    String pass2 = String.valueOf(newPintf.getPassword());
                    String q2 = "update login set pin = '" + pass2 +  "' where pin = '" + pass1 + "' ";
                    Database.s.executeUpdate(q2);
                    String q3=  "update bank set pin = '" + pass2 +   "'    where pin = '" + oldPasswordCheck + "'";
                    Database.s.executeUpdate(q3);
                    JOptionPane.showMessageDialog(null, "PIN changed successfully");
                    new Transcations();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "PIN entered doesn't match");
                }
            }else if(ae.getSource()==b2){
            new Transcations();
            this.dispose();
        }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }//catch

//
//        try{
//            String a = oldpintf.getText();
//            String b = newPintf.getText();
//            String c = re_pintf.getText();
//            if(ae.getSource()==b1){
//                if(oldpintf.getText().equals("")){
//                    JOptionPane.showMessageDialog(null, "Please Enter Current PIN");
//                }
//                if(newPintf.getText().equals("")){
//                    JOptionPane.showMessageDialog(null, "Enter New PIN");
//                }
//                if (re_pintf.getText().equals("")){
//                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
//                }
//                if(newPintf.getText().equals(re_pintf.getText())){
//                    conn c1 = new conn();
//                    String q1 = "update bank set pin = '"+b+"' where pin = '"+a+"' ";
//                    String q2 = "update login set pin = '"+b+"' where pin = '"+a+"' ";
//                    String q3 = "update signup3 set pin = '"+b+"' where pin = '"+a+"' ";
//                    c1.s.executeUpdate(q1);
//                    c1.s.executeUpdate(q2);
//                    c1.s.executeUpdate(q3);
//                    JOptionPane.showMessageDialog(null, "PIN changed successfully");
//                    new Transcations();
//                    this.dispose();
//                }else{
//                    JOptionPane.showMessageDialog(null, "PIN entered doesn't match");
//                }
//
//            }else if(ae.getSource()==b2){
//                new Transcations();
//                this.dispose();
//            }
//        }catch(Exception e){
//                    e.printStackTrace();
//                    System.out.println("error: "+e);
//        }
//
    }

    
        
    
    public static void main(String[] args){
        new Pin();
    }
}
