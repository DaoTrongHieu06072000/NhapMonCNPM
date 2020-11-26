package com.btl.nhapmoncnpm.dao.impl;


import com.btl.nhapmoncnpm.dao.IThanhVienCuaHoDAO;
import com.btl.nhapmoncnpm.mappers.ThanhVienCuaHoMapper;
import com.btl.nhapmoncnpm.models.ThanhVienCuaHoModel;
import java.util.List;

public class ThanhVienCuaHoDAO extends AbstractDAO<ThanhVienCuaHoModel> implements IThanhVienCuaHoDAO {
    @Override
    public List<ThanhVienCuaHoModel> findAll() {
        String sql = "SELECT * FROM thanh_vien_cua_ho";
        return query(sql,new ThanhVienCuaHoMapper());
    }

    @Override
    public int DemThanhVien(int idHoKhau) {
        String sql = "SELECT COUNT(*) FROM thanh_vien_cua_ho WHERE idHoKhau = ?";
        return count(sql, idHoKhau);
    }
}
