package com.btl.nhapmoncnpm.dao;


import com.btl.nhapmoncnpm.models.NhanKhauModel;
import java.util.List;

public interface INhanKhauDAO extends GenericDAO<NhanKhauModel> {
    List<NhanKhauModel> findAll();
}
