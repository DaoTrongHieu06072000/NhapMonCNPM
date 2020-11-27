package com.btl.nhapmoncnpm.dao.impl;



import com.btl.nhapmoncnpm.dao.IPhiVeSinhDAO;
import com.btl.nhapmoncnpm.mappers.PhiVeSinhMapper;
import com.btl.nhapmoncnpm.models.PhiVeSinhModel;
import java.util.List;

public class PhiVeSinhDAO extends AbstractDAO<PhiVeSinhModel> implements IPhiVeSinhDAO {
    @Override
    public List<PhiVeSinhModel> findAll() {
        String sql = "SELECT * FROM phiVeSinh";
        return query(sql, new PhiVeSinhMapper());
    }

    @Override
    public Long save(PhiVeSinhModel phiVeSinhModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO phi_ve_sinh (idHoKhau, phiVeSinh, ");
        sql.append("ngayNop, Da_thu, SoNhanKhau, Thang, Nam");
        sql.append(" VALUES (?, ?, ?, ?, ?, ?, ?)");
        return insert(sql.toString(), phiVeSinhModel.getIdHoKhau(), phiVeSinhModel.getPhiVeSinh(), phiVeSinhModel.getNgayNop(),
                phiVeSinhModel.getDaThu(), phiVeSinhModel.getSoNhanKhau(), phiVeSinhModel.getThang(), phiVeSinhModel.getNam());
    }

    @Override
    public void update(PhiVeSinhModel updatePhiVeSinh) {
        StringBuilder sql = new StringBuilder("UPDATE phi_ve_sinh SET idHoKhau = ?, phiVeSinh = ?");
        sql.append(", ngayNop = ?, Da_thu = ?, SoNhanKhau = ?, Thang = ?, Nam = ? WHERE idphi_ve_sinh = ?");
        update(sql.toString(), updatePhiVeSinh.getIdHoKhau(), updatePhiVeSinh.getPhiVeSinh(), updatePhiVeSinh.getNgayNop(), updatePhiVeSinh.getDaThu(),
                updatePhiVeSinh.getSoNhanKhau(), updatePhiVeSinh.getThang(), updatePhiVeSinh.getNam(), updatePhiVeSinh.getIdPhiVeSinh());
    }

    @Override
    public int getTotalItem() {
        String sql = "SELECT COUNT(*) FROM phi_ve_sinh";
        return count(sql);

    }
}
