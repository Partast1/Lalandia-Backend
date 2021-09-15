package com.example.Lalandia_Backend.handlers;

import com.example.Lalandia_Backend.models.ActivityPlace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBHandlerTest {

    protected Connection Connect(){
        Connection con = null;
        try{
//            synchronized (this) {
//                Class.forName("com.mysql.jdbc.Driver");
//            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/IsolationDB?useSSL=false&allowPublicKeyRetrieval=true", "root", "P@ssW0rd");
                    "jdbc:mysql://localhost:3306/LalandiaDB?useSSL=false&allowPublicKeyRetrieval=true", "root", "P@ssW0rd");

        }catch(Exception e){ System.out.println(e);}
        finally{
            return con;
        }


    }
    public void GetActivityPlaces(){

        ActivityPlace place = null;

        Connection con = Connect();
        try{
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select ActivityName, Actual_quests, Max_quests from ActivityPlace");

            while(rs.next())
                place = new ActivityPlace(rs.getString(1),rs.getInt(2), rs.getInt(3));
            System.out.println("Activity name:" + " " + place.getPlaceName() + " " + "Min guests" + place.getActualGuests() + " " + "Max guests" + place.getMaximumGuests());
            con.close();

        }
        catch(Exception e){ System.out.println(e);}
        finally{

        }
    }
}
