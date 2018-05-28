/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import winecatalog.frames.HomeFrame;
import winecatalog.object.WineObject;

/**
 *
 * @author wans8
 */
public class DatabaseConnect {
    public Connection c = null;
    public List<WineObject> wineList = new ArrayList<>();
    
    public boolean dbConnect() {
        try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/postgres",
            "postgres", "admin");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
      return true;
    }
    
    public List<WineObject> dbSelect(String pole) throws SQLException {
        List<WineObject> resultList = new ArrayList<>();
        Statement stmt = null;
        stmt = c.createStatement();
        ResultSet rs;
        try {
            if (!pole.equals("Все")) {
                rs = stmt.executeQuery( "SELECT * FROM basic " + "WHERE color = " + "'" + pole + "'" + ";" );
            } else {
                rs = stmt.executeQuery( "SELECT * FROM basic;");
            }
         while (rs.next()) {
            WineObject obj = new WineObject(); 
            obj.setId(rs.getInt("id"));
            obj.setName(rs.getString("name"));
            obj.setCompany(rs.getString("company"));
            obj.setCountry(rs.getString("country"));
            obj.setColor(rs.getString("color"));
            obj.setGrape(rs.getString("grape"));
            obj.setSugar(rs.getString("sugar"));
            obj.setDescription(rs.getString("description"));
            obj.setPic(rs.getString("picture"));
            obj.setYear(rs.getInt("year"));
            obj.setAlcohol(rs.getDouble("alcohol"));
            obj.setPrice(rs.getDouble("price"));
            resultList.add(obj);
          }
         rs.close();
         stmt.close();
         c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
      }
        return resultList;
    }
}
