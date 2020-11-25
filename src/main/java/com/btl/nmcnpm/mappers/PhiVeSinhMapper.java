package com.btl.nmcnpm.mappers;

import com.btl.nmcnpm.mapper.RowMapper;
import com.btl.nmcnpm.models.PhiVeSinhModel;
import java.sql.ResultSet;

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
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
