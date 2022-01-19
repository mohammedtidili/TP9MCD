package cigma.pfe.dao;

import cigma.pfe.model.CarteFidelio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CarteFidelioDaoImp implements CarteFidelioDao {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Mcd_exercise");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void ajouterCarteFidelio (CarteFidelio carteFidelio) {
        entityManager.getTransaction().begin();
        entityManager.persist(carteFidelio);
        entityManager.getTransaction().commit();
    }

    @Override
    public CarteFidelio trouverCarteFidelio (Long id) {
        CarteFidelio carteFidelioExist = entityManager.find(CarteFidelio.class, id);
        if (carteFidelioExist != null) {
            System.out.println("Carte fidelio touver : " + carteFidelioExist.getNum() + "  " + carteFidelioExist.getCode());
            return carteFidelioExist;
        } else {
            System.out.println("Carte fidelio n'existe pas dans la BDD .");
            return null;
        }
    }

    @Override
    public CarteFidelio modifierCarteFidelio (CarteFidelio carteFidelio) {
        CarteFidelio carteFidelioExist = entityManager.find(CarteFidelio.class, carteFidelio.getNum());
        if (carteFidelioExist != null) {
            entityManager.getTransaction().begin();
            carteFidelioExist.setCode(carteFidelio.getCode());
            carteFidelioExist.setClientCarteFidelio(carteFidelio.getClientCarteFidelio());
            entityManager.persist(carteFidelioExist);
            entityManager.getTransaction().commit();
        }
        return null;
    }

    @Override
    public void supprimerCarteFidelio (CarteFidelio carteFidelio) {
        CarteFidelio carteFidelioExist = entityManager.find(CarteFidelio.class, carteFidelio.getNum());
        if (carteFidelioExist != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(carteFidelioExist);
            entityManager.getTransaction().commit();
            System.out.println("carteFidelio a été bien supprimer");
        }
    }
}
