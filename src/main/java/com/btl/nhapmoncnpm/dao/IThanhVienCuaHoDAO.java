package com.btl.nhapmoncnpm.dao;

import com.btl.nhapmoncnpm.models.ThanhVienCuaHoModel;
import java.util.List;

public interface IThanhVienCuaHoDAO extends GenericDAO<ThanhVienCuaHoModel> {
    List<ThanhVienCuaHoModel> findAll();
    int DemThanhVien(int idHoKhau);
}
