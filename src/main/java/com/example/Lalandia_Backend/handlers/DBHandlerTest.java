package com.example.Lalandia_Backend.handlers;

import com.example.Lalandia_Backend.models.ActivityPlace;
import com.example.Lalandia_Backend.models.Chip;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Denne klasse er brugt til testning af database forbindelsen
 *  Der skal bruges en jar file som data access
 */
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
    public List<ActivityPlace> GetActivityPlaces(){

        List<ActivityPlace> activities = new ArrayList<ActivityPlace>();
        ActivityPlace place = null;

        Connection con = Connect();
        try{
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select ActivityName, Actual_quests, Max_quests from ActivityPlace");

            while(rs.next())
               activities.add( place = new ActivityPlace(rs.getString(1),rs.getInt(2), rs.getInt(3)));
            System.out.println("Activity name:" + " " + place.getPlaceName() + " " + "Min guests" + place.getActualGuests() + " " + "Max guests" + place.getMaximumGuests());
            con.close();

        }
        catch(Exception e){ System.out.println(e);}
        finally{
return activities;
        }
    }

     public List<Chip> GetChips(){
        List<Chip> chips=new ArrayList(){};


         Connection con = Connect();
         try {
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select RFID from Chip");

             while(rs.next())
                 chips.add(  new Chip(rs.getString(1)));
             con.close();

         } catch (SQLException throwables) {
             throwables.printStackTrace();
         }


         return chips;
     }

     public void ActivityGuestIncrease(){
         Connection con = Connect();
         String sql = "UPDATE ActivityPlace SET ActivityName WHERE ActivityName = Aquadome";

//         PreparedStatement statement = con.prepareStatement(sql);
//         statement.setDouble(1, location.getLatitude());

     }
     public void GetActualGuestsActivity(){

     }
     public void ChangeMaxGuests(String place, int maxGuests){
         Connection con = Connect();
         String sql = "UPDATE ActivityPlace  SET Max_quests  = ? WHERE ActivityName = ? " ;


         try{
             PreparedStatement prepareStmt = con.prepareStatement(sql);
             prepareStmt.setInt(1,maxGuests);
             prepareStmt.setString(2,place);

             prepareStmt.executeUpdate();


             con.close();


         }
         catch (SQLException throwables) {
             throwables.printStackTrace();
         }



     }
}
