package com.btl.nhapmoncnpm.dao.impl;

import services.DAO.IMPL.AbstractDAO;
import com.btl.nhapmoncnpm.dao.IUserDAO;
import com.btl.nhapmoncnpm.mappers.UserMapper;
import com.btl.nhapmoncnpm.models.UserModel;
import java.util.List;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO {
    @Override
    public List<UserModel> findAll() {
        String sql = "SELECT * FROM users";
        return query(sql, new UserMapper());
    }
}
