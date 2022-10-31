/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Veenadharini
 */
public class CityDirectory {
//    public ArrayList<City>getData(String city_name){
//
//    ArrayList<City> list = new ArrayList<City>();
//     
//    try {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital","root","");
//        Statement st = conn.createStatement();
//        String sql ="SELECT `city_name`, `community`, `hospital`, `house` FROM `city` WHERE `city_name` = '"+city_name+"'";
//        ResultSet rs = st.executeQuery(sql);
//   
//        City c;
//        while(rs.next()){
//            c = new City(
//            rs.getString("city_name"),
//            rs.getString("community"),
//            rs.getString("Hospital"),
//            rs.getString("House")
//
//            );
//            list.add(c);
//        }
//   
//    } catch (Exception e) {
//    JOptionPane.showMessageDialog(null,e);
//    }
//    return list;
//    }
}
