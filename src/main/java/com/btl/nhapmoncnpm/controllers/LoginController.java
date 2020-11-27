
package com.btl.nhapmoncnpm.controllers;

import com.btl.nhapmoncnpm.dao.impl.UserDAO;
import com.btl.nhapmoncnpm.models.UserModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


/**
 *
 * @author Hai
 */
public class LoginController {
    
    public static UserModel currentUser = new UserModel();
    
    /*public boolean login(String userName, String passwod) throws SQLException, ClassNotFoundException{
        Connection connection = MysqlConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM users WHERE userName = '" + userName +"'");
        if (rs == null) {
            return false;
        }
        while (rs.next()) {                
            if (rs.getString("passwd") == null ? passwod == null : rs.getString("passwd").equals(passwod)) {
                LoginController.currentUser.setID(rs.getInt("ID"));
                LoginController.currentUser.setUserName(rs.getString("userName"));
                return true;
            }
        }
        connection.close();
        return false;
    }*/
    
    public boolean login(String userName, String password) {
        UserDAO userDao = new UserDAO();
        List<UserModel> findAll = userDao.findAll();
        if (findAll == null) {
            return false;
        }
        for(int i = 0; i < findAll.size(); i++) {
            if (findAll.get(i).getUserName().equals(userName) && findAll.get(i).getPasswd().equals(password)) {
                LoginController.currentUser.setID(findAll.get(i).getID());
                LoginController.currentUser.setUserName(findAll.get(i).getUserName());
              return true;  
            }
        }
        return false;
    }
}
