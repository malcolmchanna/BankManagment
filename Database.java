package company.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    Connection c;
    Statement s;
    double bal;
    public Database(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3389/b5","root","muzamil123");
            s =c.createStatement();

        }catch(Exception e){
            System.out.println(e);
        }


    }



    }



