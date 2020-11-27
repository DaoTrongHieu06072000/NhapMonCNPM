package com.btl.nhapmoncnpm.mappers;


import com.btl.nhapmoncnpm.models.PhiVeSinhModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PhiVeSinhMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs) {
        try {
            PhiVeSinhModel phiVeSinh = new PhiVeSinhModel();
            phiVeSinh.setIdHoKhau(rs.getInt("idHoKhau"));
            phiVeSinh.setIdPhiVeSinh(rs.getInt("idPhiVeSinh"));
            phiVeSinh.setDaThu(rs.getInt("daThu"));
            phiVeSinh.setNam(rs.getInt("nam"));
            phiVeSinh.setPhiVeSinh(rs.getInt("phiVeSinh"));
            phiVeSinh.setThang(rs.getInt("thang"));
            phiVeSinh.setNgayNop(rs.getTimestamp("ngayNop"));
            return phiVeSinh;
        } catch (SQLException e) {
            return null;
        }
    }

}
