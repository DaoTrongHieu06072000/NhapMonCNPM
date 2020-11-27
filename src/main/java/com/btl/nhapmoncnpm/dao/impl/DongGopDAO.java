package com.btl.nhapmoncnpm.dao.impl;



import com.btl.nhapmoncnpm.dao.IDongGopDAO;
import com.btl.nhapmoncnpm.mappers.DongGopMapper;
import com.btl.nhapmoncnpm.models.DongGopModel;

import java.util.List;

public class DongGopDAO extends AbstractDAO<DongGopModel> implements IDongGopDAO {
    @Override
    public List<DongGopModel> findAll() {
        String sql = "SELECT * FROM dong_gop";
        return query(sql, new DongGopMapper());
    }

    @Override
    public Long save(DongGopModel dongGopModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO dong_gop (idHoKhau, idLoaiDongGop,");
        sql.append(" idLanDong, ngayDong, so_tien)");
        sql.append(" VALUES (?, ?, ?, ?, ?)");
        return insert(sql.toString(), dongGopModel.getIdHoKhau(), dongGopModel.getIdLoaiDonggop(),
                dongGopModel.getIdLanDong(), dongGopModel.getNgayDong(), dongGopModel.getSoTien());
    }

    @Override
    public void update(DongGopModel updateDonggop) {
        StringBuilder sql = new StringBuilder("UPDATE dong_gop SET idHoKhau = ?, idLoaiDongGop = ?");
        sql.append(", idLanDong = ?, ngayDong = ?, so_tien = ? WHERE iddong_gop = ?");
        update(sql.toString(), updateDonggop.getIdHoKhau(), updateDonggop.getIdLoaiDonggop(), updateDonggop.getIdLanDong(),
                updateDonggop.getNgayDong(), updateDonggop.getSoTien(), updateDonggop.getIdDongGop());
    }

    @Override
    public int getTotalItem() {
        String sql = "SELECT COUNT(*) FROM dong_gop";
        return count(sql);
    }
}
