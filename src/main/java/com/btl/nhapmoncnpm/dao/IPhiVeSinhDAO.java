package com.btl.nhapmoncnpm.dao;


import com.btl.nhapmoncnpm.models.PhiVeSinhModel;
import java.util.List;

public interface IPhiVeSinhDAO extends GenericDAO<PhiVeSinhModel> {
    List<PhiVeSinhModel> findAll();
    Long save(PhiVeSinhModel phiVeSinhModel);
    void update(PhiVeSinhModel updatePhiVeSinh);
    int getTotalItem();
}
