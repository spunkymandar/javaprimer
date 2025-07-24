package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest {
    public static void connectDB(){
        String url="jdbc:mysql://localhost:3306/test";
        String user="root";
        String password="n3u3da!";
        try{
            Connection con= DriverManager.getConnection(url,user,password);
            if(con!=null){
                System.out.println("Connection established");
            }
            Statement st= con.createStatement();
            ResultSet rs =st.executeQuery("Select * from employee");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" , "+rs.getString(2));
            }

        }
        catch(Exception e){

        }
    }
}
