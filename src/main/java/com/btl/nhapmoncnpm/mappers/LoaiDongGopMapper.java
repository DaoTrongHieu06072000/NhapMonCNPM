package com.btl.nhapmoncnpm.mappers;

import com.btl.nhapmoncnpm.models.LoaiDongGopModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoaiDongGopMapper implements RowMapper {

    @Override
    public LoaiDongGopModel mapRow(ResultSet rs) {
        try {

            LoaiDongGopModel loaiDongGop = new LoaiDongGopModel();
            loaiDongGop.setCode(rs.getString("code"));
            loaiDongGop.setIdLoaiDongGop(rs.getInt("idLoaiDongGop"));
            loaiDongGop.setName(rs.getString("name"));
            return loaiDongGop;
        }catch (SQLException e){
            return null;
        }
    }
}
