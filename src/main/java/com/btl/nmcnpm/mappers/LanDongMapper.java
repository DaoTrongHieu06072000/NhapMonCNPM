package com.btl.nmcnpm.mappers;

import com.btl.nmcnpm.mapper.RowMapper;
import com.btl.nmcnpm.models.LanDongModel;
import java.sql.ResultSet;

public class LanDongMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs) {
        try {
            LanDongModel lanDong = new LanDongModel();
            lanDong.setIdLanDong(rs.getInt("idLanDong"));
            lanDong.setLanThu(rs.getInt("lanThu"));
            lanDong.setNgay(rs.getTimestamp("ngay"));
            return lanDong;
        } catch (Exception e) {
            e.printStackTrace();;
            return null;
        }

    }

}
