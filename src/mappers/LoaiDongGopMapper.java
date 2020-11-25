package com.btl.nmcnpm.mappers;

import com.btl.nmcnpm.models.LoaiDongGopModel;

import java.sql.ResultSet;

public class LoaiDongGopMapper implements com.btl.nmcnpm.mapper.RowMapper {

    @Override
    public LoaiDongGopModel mapRow(ResultSet rs) {
        try {

            LoaiDongGopModel loaiDongGop = new LoaiDongGopModel();
            loaiDongGop.setCode(rs.getString("code"));
            loaiDongGop.setIdLoaiDongGop(rs.getInt("idLoaiDongGop"));
            loaiDongGop.setName(rs.getString("name"));
            return loaiDongGop;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
