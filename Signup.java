package company.com;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup extends JFrame implements ActionListener{
    
    JLabel formNol,peronsall,namel,fnamel,birthl,genderl,emaill,maritall,adrressl,cityl,pinl,statel,datel,monthl,yearl;
    JTextField nametf,fnametf,femailtf,faddresstf,fcitytf,fpintf,fstatef;
    JRadioButton maleR,femaleR,marraidR,unmarraidR,otherR;
    JButton b;
    JComboBox datecb,monthcb,yearcb;
    JFrame frame;
    JPanel Panel;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);

    Database database = new Database();
    
    Signup(){
        frame = new JFrame("NEW ACCOUNT APPLICATION FORM");
        Panel = new JPanel();

        formNol = new JLabel("APPLICATION FORM NO. "+first);
        formNol.setFont(new Font("Raleway", Font.BOLD, 38));
        
        peronsall = new JLabel("Page 1: Personal Details");
        peronsall.setFont(new Font("Raleway", Font.BOLD, 22));
        
        namel = new JLabel("Name:");
        namel.setFont(new Font("Raleway", Font.BOLD, 20));
        
        fnamel = new JLabel("Father's Name:");
        fnamel.setFont(new Font("Raleway", Font.BOLD, 20));
        
        birthl = new JLabel("Date of Birth:");
        birthl.setFont(new Font("Raleway", Font.BOLD, 20));
        
        genderl = new JLabel("Gender:");
        genderl.setFont(new Font("Raleway", Font.BOLD, 20));
        
        emaill = new JLabel("Email Address:");
        emaill.setFont(new Font("Raleway", Font.BOLD, 20));
        
        maritall = new JLabel("Marital Status:");
        maritall.setFont(new Font("Raleway", Font.BOLD, 20));
        
        adrressl = new JLabel("Address:");
        adrressl.setFont(new Font("Raleway", Font.BOLD, 20));
        
        cityl = new JLabel("City:");
        cityl.setFont(new Font("Raleway", Font.BOLD, 20));
        
        pinl = new JLabel("Pin Code:");
        pinl.setFont(new Font("Raleway", Font.BOLD, 20));
        
        statel = new JLabel("State:");
        statel.setFont(new Font("Raleway", Font.BOLD, 20));
        
        datel = new JLabel("Date");
        datel.setFont(new Font("Raleway", Font.BOLD, 14));
        
        monthl = new JLabel("Month");
        monthl.setFont(new Font("Raleway", Font.BOLD, 14));
        
        yearl = new JLabel("Year");
        yearl.setFont(new Font("Raleway", Font.BOLD, 14));
        
        
        nametf = new JTextField();
        nametf.setFont(new Font("Raleway", Font.BOLD, 14));
        
        fnametf = new JTextField();
        fnametf.setFont(new Font("Raleway", Font.BOLD, 14));
        
        femailtf = new JTextField();
        femailtf.setFont(new Font("Raleway", Font.BOLD, 14));
        
        faddresstf = new JTextField();
        faddresstf.setFont(new Font("Raleway", Font.BOLD, 14));
        
        fcitytf = new JTextField();
        fcitytf.setFont(new Font("Raleway", Font.BOLD, 14));
        
        fpintf = new JTextField();
        fpintf.setFont(new Font("Raleway", Font.BOLD, 14));
        
        fstatef = new JTextField();
        fstatef.setFont(new Font("Raleway", Font.BOLD, 14));
        
       
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        maleR = new JRadioButton("Male");
        maleR.setFont(new Font("Raleway", Font.BOLD, 14));
        maleR.setForeground(Color.white);
        maleR.setBackground(Color.BLACK);
        
        femaleR = new JRadioButton("Female");
        femaleR.setFont(new Font("Raleway", Font.BOLD, 14));
        femaleR.setBackground(Color.BLACK);
        femaleR.setForeground(Color.white);

        marraidR = new JRadioButton("Married");
        marraidR.setFont(new Font("Raleway", Font.BOLD, 14));
        marraidR.setBackground(Color.BLACK);
        marraidR.setForeground(Color.white);


        unmarraidR = new JRadioButton("Unmarried");
        unmarraidR.setFont(new Font("Raleway", Font.BOLD, 14));
        unmarraidR.setBackground(Color.BLACK);
        unmarraidR.setForeground(Color.white);

        otherR = new JRadioButton("Other");
        otherR.setFont(new Font("Raleway", Font.BOLD, 14));
        otherR.setBackground(Color.BLACK);
        otherR.setForeground(Color.white);



        String date[] = {"1","2","3","4","5","6","7","8","9"};
        datecb = new JComboBox(date);
        datecb.setBackground(Color.BLACK);
        datecb.setForeground(Color.white);


        String month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        monthcb = new JComboBox(month);
        monthcb.setBackground(Color.BLACK);
        monthcb.setForeground(Color.white);


        String year[] = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002"};
        yearcb = new JComboBox(year);
        yearcb.setBackground(Color.BLACK);
        yearcb.setForeground(Color.white);




        Panel.setLayout(null);
        formNol.setBounds(140,20,600,40);
        Panel.add(formNol);
        
        peronsall.setBounds(290,70,600,30);
        Panel.add(peronsall);
        
        namel.setBounds(100,140,100,30);
        Panel.add(namel);
        
        nametf.setBounds(300,140,400,30);
        Panel.add(nametf);
        
        fnamel.setBounds(100,190,200,30);
        Panel.add(fnamel);
        
        fnametf.setBounds(300,190,400,30);
        Panel.add(fnametf);
        
        birthl.setBounds(100,240,200,30);
        Panel.add(birthl);
        
        datel.setBounds(300,240,40,30);
        Panel.add(datel);
        
        datecb.setBounds(340,240,60,30);
        Panel.add(datecb);
        
        monthl.setBounds(410,240,50,30);
        Panel.add(monthl);
        
        monthcb.setBounds(460,240,100,30);
        Panel.add(monthcb);
        
        yearl.setBounds(570,240,40,30);
        Panel.add(yearl);
        
        yearcb.setBounds(610,240,90,30);
        Panel.add(yearcb);
        
        genderl.setBounds(100,290,200,30);
        Panel.add(genderl);
        
        maleR.setBounds(300,290,60,30);
        Panel.add(maleR);
        
        femaleR.setBounds(450,290,90,30);
        Panel.add(femaleR);
        
        emaill.setBounds(100,340,200,30);
        Panel.add(emaill);
        
        femailtf.setBounds(300,340,400,30);
        Panel.add(femailtf);
        
        maritall.setBounds(100,390,200,30);
        Panel.add(maritall);
        
        marraidR.setBounds(300,390,100,30);
        Panel.add(marraidR);
        
        unmarraidR.setBounds(450,390,100,30);
        Panel.add(unmarraidR);
        
        otherR.setBounds(635,390,100,30);
        Panel.add(otherR);
        
        
        
        adrressl.setBounds(100,440,200,30);
        Panel.add(adrressl);
        
        faddresstf.setBounds(300,440,400,30);
        Panel.add(faddresstf);
        
        cityl.setBounds(100,490,200,30);
        Panel.add(cityl);
        
        fcitytf.setBounds(300,490,400,30);
        Panel.add(fcitytf);
        
        pinl.setBounds(100,540,200,30);
        Panel.add(pinl);
        
        fpintf.setBounds(300,540,400,30);
        Panel.add(fpintf);
        
        statel.setBounds(100,590,200,30);
        Panel.add(statel);
        
        fstatef.setBounds(300,590,400,30);
        Panel.add(fstatef);
        
        b.setBounds(620,660,80,30);
        Panel.add(b);
        
        b.addActionListener(this);
        Color color = new Color(255, 255, 255);
        peronsall.setForeground(color); namel.setForeground(color);
         fnamel.setForeground(color);
         birthl.setForeground(color);
         genderl.setForeground(color);
         emaill.setForeground(color);
         maritall.setForeground(color);
         adrressl.setForeground(color);
         cityl.setForeground(color);
         pinl.setForeground(color);
         statel.setForeground(color); datel.setForeground(color);
         monthl.setForeground(color);yearl.setForeground(color);
        formNol.setForeground(color);

        Panel.setBackground(Color.BLACK);
        frame.add(Panel);
        frame.setSize(830,800);
        frame.setLocation(350,20);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        
        String a = nametf.getText();
        String b = fnametf.getText();
        
        String ac = (String)datecb.getSelectedItem(); 
        String bc = (String)monthcb.getSelectedItem();
        String cc = (String)yearcb.getSelectedItem();
        
        String d = null;
        if(maleR.isSelected()){ 
            d = "Male";
        }
        else if(femaleR.isSelected()){ 
            d = "Female";
        }
            
        String e = femailtf.getText();
        String f = null;
        if(marraidR.isSelected()){ 
            f = "Married";
        }else if(unmarraidR.isSelected()){ 
            f = "Unmarried";
        }else if(otherR.isSelected()){ 
            f = "Other";
        }
           
        String g = faddresstf.getText();
        String h = fcitytf.getText();
        String i = fpintf.getText();
        String j = fstatef.getText();


        try{
           
            if(fpintf.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                
                String q1 = "insert into signup values('"+a+"','"+b+"','"+ac+"','"+bc+"','"+cc+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+first+"')";
                database.s.executeUpdate(q1);
                new Signup2().Panel.setVisible(true);
                frame.setVisible(false);
            }
            
        }catch(Exception ex){
             ex.printStackTrace();
        }
        
    }
    
    
    public static void main(String[] args){
              new Signup();
    }
}
