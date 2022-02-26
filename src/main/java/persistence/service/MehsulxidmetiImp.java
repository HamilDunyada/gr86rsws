package persistence.service;

import model.MehsulModel;
import persistence.dao.MehsulDao;
import persistence.dao.MehsulDaoImp;

import java.util.List;

public class MehsulxidmetiImp implements Mehsulxidmeti{
    private MehsulDao mehsulDao = new MehsulDaoImp();


    @Override
    public List<MehsulModel> getAllmehsullar() {
        return mehsulDao.getAllmehsullar();
    }

    @Override
    public void addMehsullar(MehsulModel model) {

        mehsulDao.addMehsullar(model);

    }

    @Override
    public void updateMehsullar(MehsulModel model) {
        mehsulDao.updateMehsullar(model);
    }


    @Override
    public void deleteMehsullar(Integer kod) {
        mehsulDao.deleteMehsullar(kod);

    }
}
