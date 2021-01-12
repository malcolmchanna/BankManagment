package company.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountInfo implements ActionListener {
          JFrame frame;
          JPanel panel;
    Database database;
    JLabel peronsall,namel,fnamel,birthl,genderl,emaill,maritall,adrressl,cityl,pinl,statel;
    JLabel additionall,religionl,categoryl,incomel,educationl,Occupationl,pannuml,adharl,citizenl,exitingaccountl, l11;

    JLabel carno;
    JTextField cardnotf;
    Button Secrah;
    JLabel formNolset,peronsallset,namelset,fnamelset,birthlset,genderlset,emaillset,maritallset,adrresslset,citylset,pinlset, statelset;

    JLabel religionlset,categorylset,incomelset,educationlset,Occupationlset,pannumlset,adharlset,citizenlset,exitingaccountlset,l11set;

    JLabel acctypel, servicel;
    JLabel acctypelset, servicelset;




    String name ;

    AccountInfo() {
        frame = new JFrame("ACCOUNT INFORMATION");
        panel = new JPanel();


//sigup
        peronsall = new JLabel("ACCOUNT DETAILS");
        peronsall.setFont(new Font("Raleway", Font.BOLD, 40));

        namel = new JLabel("Name:");
        namel.setFont(new Font("Raleway", Font.BOLD, 15));

        fnamel = new JLabel("Father's Name:");
        fnamel.setFont(new Font("Raleway", Font.BOLD, 15));

        birthl = new JLabel("Date of Birth:");
        birthl.setFont(new Font("Raleway", Font.BOLD, 15));

        genderl = new JLabel("Gender:");
        genderl.setFont(new Font("Raleway", Font.BOLD, 15));

        emaill = new JLabel("Email Address:");
        emaill.setFont(new Font("Raleway", Font.BOLD, 15));

        maritall = new JLabel("Marital Status:");
        maritall.setFont(new Font("Raleway", Font.BOLD, 15));

        adrressl = new JLabel("Address:");
        adrressl.setFont(new Font("Raleway", Font.BOLD, 15));

        cityl = new JLabel("City:");
        cityl.setFont(new Font("Raleway", Font.BOLD, 15));

        pinl = new JLabel("Pin Code:");
        pinl.setFont(new Font("Raleway", Font.BOLD, 15));

        statel = new JLabel("State:");
        statel.setFont(new Font("Raleway", Font.BOLD, 15));
//setsigup
        namelset = new JLabel();
        panel.add(namelset);
        namelset.setFont(new Font("Raleway", Font.BOLD, 15));

        fnamelset = new JLabel();
        fnamelset.setFont(new Font("Raleway", Font.BOLD, 15));
        panel.add(fnamelset);

        birthlset = new JLabel();
        birthlset.setFont(new Font("Raleway", Font.BOLD, 15));
        panel.add(birthlset);

        genderlset = new JLabel();
        genderlset.setFont(new Font("Raleway", Font.BOLD, 15));
        panel.add(genderlset);

        emaillset = new JLabel();
        genderlset.setFont(new Font("Raleway", Font.BOLD, 15));
        panel.add(emaillset);

        maritallset = new JLabel();
        maritallset.setFont(new Font("Raleway", Font.BOLD, 15));
        panel.add(maritallset);

        adrresslset = new JLabel();
        adrresslset.setFont(new Font("Raleway", Font.BOLD, 15));
        panel.add(adrresslset);

        citylset = new JLabel();
        citylset.setFont(new Font("Raleway", Font.BOLD, 15));
        panel.add(citylset);

        pinlset = new JLabel();
        pinlset.setFont(new Font("Raleway", Font.BOLD, 15));
        panel.add(pinlset);

        statelset = new JLabel();
        statelset.setFont(new Font("Raleway", Font.BOLD, 15));
        panel.add(statelset);

//sigup 2
        religionl = new JLabel("Religion:");
        religionl.setFont(new Font("Raleway", Font.BOLD, 15));

        categoryl = new JLabel("Category:");
        categoryl.setFont(new Font("Raleway", Font.BOLD, 15));

        incomel = new JLabel("Income:");
        incomel.setFont(new Font("Raleway", Font.BOLD, 15));

        educationl = new JLabel("Educational");
        educationl.setFont(new Font("Raleway", Font.BOLD, 15));


        Occupationl = new JLabel("Occupatio");
        Occupationl.setFont(new Font("Raleway", Font.BOLD, 15));

        pannuml = new JLabel("CNIC NO");
        pannuml.setFont(new Font("", Font.BOLD, 15));

        adharl = new JLabel("ADHAR");
        adharl.setFont(new Font("", Font.BOLD, 15));

        citizenl = new JLabel("CITIZEN");
        citizenl.setFont(new Font("Raleway", Font.BOLD, 15));

        exitingaccountl = new JLabel("EXITINGACCOUNT");
        exitingaccountl.setFont(new Font("Raleway", Font.BOLD, 15));

        religionlset = new JLabel();
        religionlset.setFont(new Font("Raleway", Font.BOLD, 15));

        categorylset = new JLabel();
        categorylset.setFont(new Font("Raleway", Font.BOLD, 15));

        incomelset = new JLabel();
        incomelset.setFont(new Font("Raleway", Font.BOLD, 15));

        educationlset = new JLabel();
        educationlset.setFont(new Font("Raleway", Font.BOLD, 15));

        Occupationlset = new JLabel();
        Occupationlset.setFont(new Font("Raleway", Font.BOLD, 15));

        pannumlset = new JLabel();
        pannumlset.setFont(new Font("Raleway", Font.BOLD, 15));

        adharlset = new JLabel();
        adharlset.setFont(new Font("Raleway", Font.BOLD, 15));

        citizenlset = new JLabel();
        citizenlset.setFont(new Font("Raleway", Font.BOLD, 15));

        exitingaccountlset = new JLabel();
        exitingaccountlset.setFont(new Font("Raleway", Font.BOLD, 15));


        servicel = new JLabel("Services Required:");
        servicel.setFont(new Font("Raleway", Font.BOLD, 15));

        acctypel = new JLabel("Account Type:");
        acctypel.setFont(new Font("Raleway", Font.BOLD, 15));

        servicelset = new JLabel();
        servicel.setFont(new Font("Raleway", Font.BOLD, 15));

        acctypelset = new JLabel();
        acctypelset.setFont(new Font("Raleway", Font.BOLD, 15));




        pannuml.setBounds(200,420,400,30);
        panel.add(pannuml);

        pannumlset.setBounds(380,420,400,30);
        panel.add(pannumlset);

        adharl.setBounds(200,440,400,30);
        panel.add(adharl);
        adharlset.setBounds(380,440,400,30);
        panel.add(adharlset);

        citizenl.setBounds(200,380,400,30);
        panel.add(citizenl);
        citizenlset.setBounds(380,380,400,30);
        panel.add(citizenlset);


        acctypel.setBounds(200, 460 ,400, 30);
        panel.add(acctypel);

        acctypelset.setBounds(380, 460 ,400, 30);
        panel.add(acctypelset);

        servicel.setBounds(200, 480 ,400, 30);
        panel.add(servicel);

        servicelset.setBounds(380, 480 ,400, 30);
        panel.add(servicelset);



        //
//        l11.setBounds(200, 380, 400, 30);
//        panel.add(l11);
//
//        l11set.setBounds(380, 380, 400, 30);
//        panel.add(l11set);


        panel.setLayout(null);

        peronsall.setBounds(200, 50, 400, 40);
        panel.add(peronsall);

        namel.setBounds(200, 100, 400, 30);
        panel.add(namel);
        namelset.setBounds(380, 100, 400, 30);

        fnamel.setBounds(200, 120, 400, 30);
        panel.add(fnamel);
        fnamelset.setBounds(380, 120, 400, 30);

        birthl.setBounds(200, 140, 400, 30);
        panel.add(birthl);
        birthlset.setBounds(380, 140, 400, 30);

        genderl.setBounds(200, 160, 400, 30);
        panel.add(genderl);
        genderlset.setBounds(380, 160, 400, 30);


        emaill.setBounds(200, 180, 400, 30);
        panel.add(emaill);
        emaillset.setBounds(380, 180, 400, 30);


        maritall.setBounds(200, 200, 400, 30);
        panel.add(maritall);
        maritallset.setBounds(380, 200, 400, 30);

        adrressl.setBounds(200, 220, 400, 30);
        panel.add(adrressl);
        adrresslset.setBounds(380, 220, 400, 30);

        cityl.setBounds(200, 240, 400, 30);
        panel.add(cityl);
        citylset.setBounds(380, 240, 400, 30);

        pinl.setBounds(200, 260, 400, 30);
        panel.add(pinl);
        pinlset.setBounds(380, 260, 400, 30);

        statel.setBounds(200, 280, 400, 30);
        panel.add(statel);
        statelset.setBounds(380, 280, 400, 30);


        religionl.setBounds(200, 300, 400, 30);
        panel.add(religionl);

        religionlset.setBounds(380, 300, 400, 30);
        panel.add(religionlset);

        categoryl.setBounds(200, 320, 400, 30);
        panel.add(categoryl);

        categorylset.setBounds(380, 320, 400, 30);
        panel.add(categorylset);


        incomel.setBounds(200, 340, 400, 30);
        panel.add(incomel);
        incomelset.setBounds(380, 340, 400, 30);
        panel.add(incomelset);

        educationl.setBounds(200, 360, 400, 30);
        panel.add(educationl);
        educationlset.setBounds(380, 360, 400, 30);
        panel.add(educationlset);

        Occupationl.setBounds(200, 400, 400, 30);
        panel.add(Occupationl);

        Occupationlset.setBounds(380, 400, 400, 30);
        panel.add(Occupationlset);

        carno = new JLabel("Enter Account No:");
        carno.setFont(new Font("Raleway", Font.BOLD, 20));
        carno.setBounds(180, 550, 200, 30);
        panel.add(carno);

        cardnotf = new JTextField();
        cardnotf.setBounds(380, 550, 150, 30);
        panel.add(cardnotf);

        Secrah = new Button("SEARCH");
        Secrah.setFont(new Font("Raleway", Font.BOLD, 25));
        Secrah.setBounds(280, 600, 130, 40);
        Secrah.setBackground(Color.BLACK);
        Secrah.setForeground(Color.WHITE);
        panel.add(Secrah);

        Secrah.addActionListener(this);

        ImageIcon background =new ImageIcon("iconisa190302497.jpg");
         JLabel label = new JLabel();
        label.setBounds(450, 200, 400, 300);
        label.setIcon(background);
        panel.setLayout(null);
        panel.add(label);

        panel.setBackground(Color.WHITE);



        frame.add(panel);
        frame.setSize(850, 800);
        frame.setLocation(380, 10);
        frame.setVisible(true);





    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String a =cardnotf.getText();
        if(e.getSource()==Secrah){
            try{
                database = new Database();
                String q = "select * from signup3 where cardno = '" + a + "' ";
                ResultSet rs = database.s.executeQuery(q);
                while (rs.next()) {
                    name = rs.getString("formno");
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                database = new Database();
                String q1 = "select * from signup where formno = '" + name + "' ";
                ResultSet rs1 = database.s.executeQuery(q1);
                while (rs1.next()) {
                    namelset.setText(rs1.getString("name"));
                    fnamelset.setText(rs1.getString("fname"));
                    birthlset.setText(rs1.getString("date"));
                    birthlset.setText(rs1.getString("year"));
                    birthlset.setText(rs1.getString("month"));
                    emaillset.setText(rs1.getString("email"));
                    maritallset.setText(rs1.getString("marital"));
                    genderlset.setText(rs1.getString("gender"));
                    adrresslset.setText(rs1.getString("address"));
                    citylset.setText(rs1.getString("city"));
                    pinlset.setText(rs1.getString("pincode"));
                    statelset.setText(rs1.getString("state"));
                }
                String q2  = "select * from signup2 where formno = '"+name+"' ";
                ResultSet rs3 = database.s.executeQuery(q2);
                while (rs3.next()) {
                    religionlset.setText(rs3.getString("religion"));
                    categorylset.setText(rs3.getString("category"));
                    incomelset.setText(rs3.getString("income"));
                    educationlset.setText(rs3.getString("education"));
                    Occupationlset.setText(rs3.getString("occupation"));
                    pannumlset.setText(rs3.getString("cnicno"));
                    adharlset.setText(rs3.getString("bisp"));
                    citizenlset.setText(rs3.getString("senior"));
                    exitingaccountlset.setText(rs3.getString("existing"));

                }
                String q3  = "select * from signup3 where formno = '"+name+"' ";
                ResultSet rs4 = database.s.executeQuery(q3);
                while (rs4.next()) {
                    acctypelset.setText(rs4.getString("account"));
                    servicelset.setText(rs4.getString("service_required"));
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new AccountInfo();
    }
}


