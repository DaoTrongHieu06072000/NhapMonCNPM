package com.btl.nhapmoncnpm.dao;

import com.btl.nhapmoncnpm.models.DongGopModel;
import java.util.List;

public interface IDongGopDAO extends GenericDAO<DongGopModel> {
    List<DongGopModel> findAll();
    Long save(DongGopModel dongGopModel);
    void update(DongGopModel updateDonggop);
    int getTotalItem();
}
