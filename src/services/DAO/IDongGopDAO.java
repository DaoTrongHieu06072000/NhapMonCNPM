package services.DAO;


import java.util.List;
import model.DongGopModel;

public interface IDongGopDAO extends GenericDAO<DongGopModel> {
    List<DongGopModel> findAll(String nam);
    Long save(DongGopModel dongGopModel);
    void update(DongGopModel updateDonggop);
    int getTotalItem();
    List<DongGopModel> findAllYear();
    List<DongGopModel> findByIdSk(int idSk);
    DongGopModel findByIdDG(String IDDG);
    void delete(String idSK);
}
