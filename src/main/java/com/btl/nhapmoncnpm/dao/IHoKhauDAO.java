package com.btl.nhapmoncnpm.dao;

import com.btl.nhapmoncnpm.models.HoKhauModel;
import java.util.List;

public interface IHoKhauDAO extends GenericDAO<HoKhauModel> {
    List<HoKhauModel> findAll();
}
