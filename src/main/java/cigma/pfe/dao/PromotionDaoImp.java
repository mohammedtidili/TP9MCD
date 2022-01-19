package cigma.pfe.dao;

import cigma.pfe.model.Promotion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PromotionDaoImp implements PromotionDao {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Mcd_exercise");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void ajouterPromotion (Promotion promotion) {
        entityManager.getTransaction().begin();
        entityManager.persist(promotion);
        entityManager.getTransaction().commit();
    }

    @Override
    public Promotion trouverPromotion (Long id) {
        Promotion promotionExist = entityManager.find(Promotion.class, id);
        if (promotionExist != null) {
            System.out.println("Promotion a été trouver : " + promotionExist.getNum() + "  " + promotionExist.getDescription());
            return promotionExist;
        } else {
            System.out.println("Promotion n'existe pas dans la BDD .");
            return null;
        }
    }

    @Override
    public Promotion modifierPromotion (Promotion promotion) {
        Promotion promotionExist = trouverPromotion(promotion.getNum());
        if (promotionExist != null) {
            entityManager.getTransaction().begin();
            promotionExist.setDescription(promotion.getDescription());
            promotionExist.setListClientPromotion(promotion.getListClientPromotion());
            entityManager.persist(promotionExist);
            entityManager.getTransaction().commit();
            System.out.println("Promotion a bien été modifier  : " + promotionExist.getNum() + "  " + promotionExist.getDescription());
        }
        return null;
    }

    @Override
    public void supprimerPromotion (Promotion promotion) {
        Promotion promotionExist = trouverPromotion(promotion.getNum());
        if (promotionExist != null) {
            entityManager.remove(promotionExist);
            System.out.println("Promotion a bien été supprimer  : " + promotionExist.getNum() + "  " + promotionExist.getDescription());
        }
    }
}
