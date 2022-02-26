package persistence.service;

import model.MehsulModel;

import java.util.List;

public interface Mehsulxidmeti {
    List<MehsulModel> getAllmehsullar();
    void addMehsullar(MehsulModel model);
    void updateMehsullar(MehsulModel model);
    void deleteMehsullar(Integer kod);
}
