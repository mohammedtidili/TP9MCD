package cigma.pfe.dao;

import cigma.pfe.model.Produit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProduitDaoImp implements ProduitDao {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Mcd_exercise");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void ajouterProduit (Produit produit) {
        entityManager.getTransaction().begin();
        entityManager.persist(produit);
        entityManager.getTransaction().commit();
    }

    @Override
    public Produit trouverProduit (Long id) {
        Produit produitExist = entityManager.find(Produit.class, id);
        if (produitExist != null) {
            System.out.println("Produit a été trouver : " + produitExist.getNum() + "  " + produitExist.getDesignation());
            return produitExist;
        } else {
            System.out.println("Produit n'existe pas dans la BDD.");
            return null;
        }
    }

    @Override
    public Produit modifierProduit (Produit produit) {
        Produit produitExist = trouverProduit(produit.getNum());
        if (produitExist != null) {
            entityManager.getTransaction().begin();
            produitExist.setDesignation(produit.getDesignation());
            produitExist.setPrix(produit.getPrix());
            produitExist.setStock(produit.getStock());
            produitExist.setListFacture(produit.getListFacture());
            entityManager.persist(produitExist);
            entityManager.getTransaction().commit();
            System.out.println("Produit bien été modifier : " + produitExist.getNum() + "  " + produitExist.getDesignation());
        }
        return null;
    }

    @Override
    public void supprimerProduit (Produit produit) {
        Produit produitExist = trouverProduit(produit.getNum());
        if (produitExist != null) {
            entityManager.remove(produitExist);
            System.out.println("Produit a été bien supprimer : " + produitExist.getNum() + "  " + produitExist.getDesignation());

        }
    }
}
