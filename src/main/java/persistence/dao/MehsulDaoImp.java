package persistence.dao;

import model.MehsulModel;
import persistence.entity.Mehsullar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class MehsulDaoImp implements MehsulDao {

    @Override
    public List<MehsulModel> getAllmehsullar(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gr86MavenProject");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        String mysql="select u from Mehsullar u";
        List<Mehsullar> mehsulList = entityManager.createQuery(mysql).getResultList();
        List<MehsulModel> mehsulNovleri = new ArrayList<>();

        for(Mehsullar mehsul:mehsulList){

            mehsulNovleri.add(new MehsulModel(mehsul.getKod(),mehsul.getMehsuladi()));
        }


        return mehsulNovleri;
    }


    @Override
    public void addMehsullar(MehsulModel model) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gr86MavenProject");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Mehsullar mehsul =new Mehsullar();

        mehsul.getMehsullar(model);


        entityManager.getTransaction().begin();
        entityManager.persist(mehsul);
        entityManager.getTransaction().commit();;
    }

    @Override
    public void updateMehsullar(MehsulModel model) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gr86MavenProject");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        entityManager.getTransaction().begin();
        Mehsullar mehsul=entityManager.find(Mehsullar.class,model.getKod());
       mehsul.setMehsuladi(model.getMehsuladi());
       // mehsul.setBitmetarixi(mehsul.getBitmetarixi());
        entityManager.persist(model);
        entityManager.getTransaction().commit();

    }



    @Override
    public void deleteMehsullar(Integer kod) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gr86MavenProject");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Mehsullar mehsul = entityManager.find(Mehsullar.class, kod);
        entityManager.remove(mehsul);
        entityManager.getTransaction().commit();


    }
}
