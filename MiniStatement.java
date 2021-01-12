package company.com;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class MiniStatement implements ActionListener{
    JTable t1;
    JButton b1;
    String x[] = {"pin","Deposit","Withdraw","Balance","Date"};
    String y[][] = new String[20][5];
    int i=0, j=0;
    JFrame frame ;
    JPanel panel;
    Database database = new Database();
    MiniStatement(){
        frame = new JFrame("Mini Statement");
        panel = new JPanel();
        try{
            String pinn = JOptionPane.showInputDialog("Enter PIN");
            String q1 = "SELECT * FROM bank where pin = '" + pinn + "'";
            ResultSet rs = database.s.executeQuery(q1);
            while(rs.next()){
                y[i][j++]=rs.getString("pin");
                y[i][j++]=rs.getString("deposit");
                y[i][j++]=rs.getString("withdraw");
                y[i][j++]=rs.getString("balance");
                y[i][j++]=rs.getString("date");

                i++;
                j=0;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        t1 = new JTable(y,x);
        b1 = new JButton("Print");
//        add(b1,"South");
        JScrollPane sp = new JScrollPane(t1);
        panel.add(sp);
        b1.addActionListener(this);

        panel.setLayout(null);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
   t1.setBounds(0,0,1200,290);
    b1.setBounds(0,290, 1200, 20);




        panel.add(t1);
        panel.add(b1);
        frame.add(panel);
        frame.setSize(1200,300);
        frame.setLocation(150,20);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            t1.print();
        }catch(Exception e){}
    }

    public static void main(String[] args){
        new MiniStatement();
    }

}
