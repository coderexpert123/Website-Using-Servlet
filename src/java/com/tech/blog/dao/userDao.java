
package com.tech.blog.dao;

import java.sql.*;
import com.tech.blog.entities.User;


public class userDao {
    private Connection con;

    public userDao(Connection con) {
        this.con = con;
    }
          boolean f=true; 
    //method to save the user
    public void saveUser(User users){
        try {
            //user-->
            
     
String query="insert into user(name,email,password,gender) values (?,?,?,?)";            
PreparedStatement preparedStatement = this.con.prepareStatement(query);
   
        preparedStatement.setString(1,users.getName());
        preparedStatement.setString(2,users.getEmail());
        preparedStatement.setString(3,users.getPassword());
        preparedStatement.setString(4,users.getGender());
        preparedStatement.executeUpdate();
        f=true;
         
            
        } catch (Exception e) {
            
            e.printStackTrace();
            f=true;
            
        }
    }
}
