package persistence.dao;

import model.MehsulModel;

import java.util.List;

public interface MehsulDao {

    List<MehsulModel> getAllmehsullar();

    void addMehsullar(MehsulModel model);

    void updateMehsullar(MehsulModel model);

    void deleteMehsullar(Integer kod);
}
