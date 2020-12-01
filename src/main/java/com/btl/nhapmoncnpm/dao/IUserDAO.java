package com.btl.nhapmoncnpm.dao;

import services.DAO.GenericDAO;
import com.btl.nhapmoncnpm.models.UserModel;
import java.util.List;

public interface IUserDAO extends GenericDAO<UserModel> {
    List<UserModel> findAll();
}
