package com.btl.nhapmoncnpm.mappers;


import services.Mapper.RowMapper;
import com.btl.nhapmoncnpm.models.UserModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<UserModel> {
    @Override
    public UserModel mapRow(ResultSet rs) {
        UserModel user = new UserModel();
        try {
            user.setID(rs.getInt("ID"));
            user.setUserName(rs.getString("userName"));
            user.setPasswd(rs.getString("passwd"));
            return user;
        } catch (SQLException e) {
            return null;
        }
    }
}
