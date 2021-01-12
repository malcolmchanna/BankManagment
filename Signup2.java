package company.com;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signup2 extends JFrame implements ActionListener{
    
    JLabel additionall,religionl,categoryl,incomel,educationl,Occupationl,pannuml,adharl,citizenl,exitingaccountl,l11,l12;
    JButton nextb;
    JRadioButton citizienr1,citizienr2,Exitaccrb,Exitaccrb2;
    JTextField formnotf,pannumtf,adhartf;
    JComboBox religioncb,categorycb,incomecb,eduaQualifcb,occuptioncb;
    JFrame frame;
    JPanel Panel;
    
        Database database = new Database();
        
    
    Signup2(){
        frame = new JFrame("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        Panel = new JPanel();

        
        
        additionall = new JLabel("Page 2: Additonal Details");
        additionall.setFont(new Font("Raleway", Font.BOLD, 22));
        additionall.setBackground(Color.BLACK);
        additionall.setForeground(Color.WHITE);

        religionl = new JLabel("Religion:");
        religionl.setFont(new Font("Raleway", Font.BOLD, 18));
        religionl.setBackground(Color.BLACK);
        religionl.setForeground(Color.WHITE);

        categoryl = new JLabel("Category:");
        categoryl.setFont(new Font("Raleway", Font.BOLD, 18));
        categoryl.setBackground(Color.BLACK);
        categoryl.setForeground(Color.WHITE);

        incomel = new JLabel("Income:");
        incomel.setFont(new Font("Raleway", Font.BOLD, 18));
        incomel.setBackground(Color.BLACK);
        incomel.setForeground(Color.WHITE);

        educationl = new JLabel("Educational");
        educationl.setFont(new Font("Raleway", Font.BOLD, 18));
        educationl.setBackground(Color.BLACK);
        educationl.setForeground(Color.WHITE);

        l11 = new JLabel("Qualification:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBackground(Color.BLACK);
        l11.setForeground(Color.WHITE);

        Occupationl = new JLabel("Occupation:");
        Occupationl.setFont(new Font("Raleway", Font.BOLD, 18));
        Occupationl.setBackground(Color.BLACK);
        Occupationl.setForeground(Color.WHITE);

        pannuml = new JLabel("PAN Number:");
        pannuml.setFont(new Font("Raleway", Font.BOLD, 18));
        pannuml.setBackground(Color.BLACK);
        pannuml.setForeground(Color.WHITE);

        adharl = new JLabel("Aadhar Number:");
        adharl.setFont(new Font("Raleway", Font.BOLD, 18));
        adharl.setBackground(Color.BLACK);
        adharl.setForeground(Color.WHITE);

        citizenl = new JLabel("Senior Citizen:");
        citizenl.setFont(new Font("Raleway", Font.BOLD, 18));
        citizenl.setBackground(Color.BLACK);
        citizenl.setForeground(Color.WHITE);

        exitingaccountl = new JLabel("Existing Account:");
        exitingaccountl.setFont(new Font("Raleway", Font.BOLD, 18));
        exitingaccountl.setBackground(Color.BLACK);
        exitingaccountl.setForeground(Color.WHITE);

        l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 13));
        
        
        
        
        nextb = new JButton("Next");
        nextb.setFont(new Font("Raleway", Font.BOLD, 14));
        nextb.setBackground(Color.BLACK);
        nextb.setForeground(Color.WHITE);

        formnotf = new JTextField();
        formnotf.setFont(new Font("Raleway", Font.BOLD, 14));
        
        pannumtf = new JTextField();
        pannumtf.setFont(new Font("Raleway", Font.BOLD, 14));
        
        adhartf = new JTextField();
        adhartf.setFont(new Font("Raleway", Font.BOLD, 13));

        citizienr1 = new JRadioButton("Yes");
        citizienr1.setFont(new Font("Raleway", Font.BOLD, 14));
        citizienr1.setBackground(Color.WHITE);
        
        citizienr2 = new JRadioButton("No");
        citizienr2.setFont(new Font("Raleway", Font.BOLD, 14));
        citizienr2.setBackground(Color.WHITE);
        
        Exitaccrb = new JRadioButton("Yes");
        Exitaccrb.setFont(new Font("Raleway", Font.BOLD, 14));
        Exitaccrb.setBackground(Color.WHITE);
        
        Exitaccrb2 = new JRadioButton("No");
        Exitaccrb2.setFont(new Font("Raleway", Font.BOLD, 14));
        Exitaccrb2.setBackground(Color.WHITE);
        
        
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religioncb = new JComboBox(religion);
        religioncb.setBackground(Color.WHITE);
        religioncb.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String category[] = {"General","OBC","SC","ST","Other"};
        categorycb = new JComboBox(category);
        categorycb.setBackground(Color.WHITE);
        categorycb.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        incomecb = new JComboBox(income);
        incomecb.setBackground(Color.WHITE);
        incomecb.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        eduaQualifcb = new JComboBox(education);
        eduaQualifcb.setBackground(Color.WHITE);
        eduaQualifcb.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        occuptioncb = new JComboBox(occupation);
        occuptioncb.setBackground(Color.WHITE);
        occuptioncb.setFont(new Font("Raleway", Font.BOLD, 14));

        Panel.setLayout(null);
        
        l12.setBounds(700,10,60,30);
        Panel.add(l12);
        
        adhartf.setBounds(760,10,60,30);
        Panel.add(adhartf);
        
        additionall.setBounds(280,30,600,40);
        Panel.add(additionall);
        
        religionl.setBounds(100,120,100,30);
        Panel.add(religionl);
        
        religioncb.setBounds(350,120,320,30);
        Panel.add(religioncb);
        
        categoryl.setBounds(100,170,100,30);
        Panel.add(categoryl);
        
        categorycb.setBounds(350,170,320,30);
        Panel.add(categorycb);
        
        incomel.setBounds(100,220,100,30);
        Panel.add(incomel);
        
        incomecb.setBounds(350,220,320,30);
        Panel.add(incomecb);
        
        educationl.setBounds(100,270,150,30);
        Panel.add(educationl);
        
        eduaQualifcb.setBounds(350,270,320,30);
        Panel.add(eduaQualifcb);
        
        l11.setBounds(100,290,150,30);
        Panel.add(l11);
        
        Occupationl.setBounds(100,340,150,30);
        Panel.add(Occupationl);
        
        occuptioncb.setBounds(350,340,320,30);
        Panel.add(occuptioncb);
        
        pannuml.setBounds(100,390,150,30);
        Panel.add(pannuml);
        
        formnotf.setBounds(350,390,320,30);
        Panel.add(formnotf);
        
        adharl.setBounds(100,440,180,30);
        Panel.add(adharl);
        
        pannumtf.setBounds(350,440,320,30);
        Panel.add(pannumtf);
        
        citizenl.setBounds(100,490,150,30);
        Panel.add(citizenl);
        
        citizienr1.setBounds(350,490,100,30);
        Panel.add(citizienr1);
        
        citizienr2.setBounds(460,490,100,30);
        Panel.add(citizienr2);
        
        exitingaccountl.setBounds(100,540,180,30);
        Panel.add(exitingaccountl);
        
        Exitaccrb.setBounds(350,540,100,30);
        Panel.add(Exitaccrb);
        
        Exitaccrb2.setBounds(460,540,100,30);
        Panel.add(Exitaccrb2);

        nextb.setBounds(570,600,100,30);
        Panel.add(nextb);
        
        nextb.addActionListener(this);
        frame.add(Panel);
        Panel.setBackground(new Color(0, 0, 0, 255));
        frame.setSize(830,800);
        frame.setLocation(350,20);

        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String b = (String)religioncb.getSelectedItem();
        String c = (String)categorycb.getSelectedItem();
        String d = (String)incomecb.getSelectedItem();
        String e = (String)eduaQualifcb.getSelectedItem();
        String f = (String)occuptioncb.getSelectedItem();
        String i = formnotf.getText();
        String h = pannumtf.getText();
        String g = "";
        if(citizienr1.isSelected()){ 
            g = "Yes";
        }
        else if(citizienr2.isSelected()){
            g = "No";
        }
        String j = "";

        if(Exitaccrb.isSelected()){ 
            j = "Yes";
        }else if(Exitaccrb2.isSelected()){ 
            j = "No";
        }
        String  a = adhartf.getText();
        try{
            if(pannumtf.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                String q1 = "insert into signup2 values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+i+"','"+h+"','"+g+"','"+j+"')";
                database.s.executeUpdate(q1);
                new Signup3().panel.setVisible(true);
                frame.dispose();
            }
        }catch(Exception ex){
             ex.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Signup2();
    }
}
