package com.btl.nmcnpm.mappers;

import com.btl.nmcnpm.models.DongGopModel;

import java.sql.ResultSet;

public class DongGopMapper implements com.btl.nmcnpm.mapper.RowMapper {

    @Override
    public DongGopModel mapRow(ResultSet rs) {
        try {
            DongGopModel dongGop= new DongGopModel();
            dongGop.setIdDongGop(rs.getInt("idDongGop"));
            dongGop.setIdHoKhau(rs.getInt("idHoKhau"));
            dongGop.setIdLanDong(rs.getInt("idLoaiDonggop"));
            dongGop.setNgayDong(rs.getTimestamp("ngayDong"));
            return dongGop;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }


    }
}
