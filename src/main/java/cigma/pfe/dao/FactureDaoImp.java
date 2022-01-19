package cigma.pfe.dao;

import cigma.pfe.model.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactureDaoImp implements FactureDao {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Mcd_exercise");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void ajouterFacture (Facture facture) {
        entityManager.getTransaction().begin();
        entityManager.persist(facture);
        entityManager.getTransaction().commit();
    }

    @Override
    public Facture trouverFacture (Long id) {
        Facture factureExist = entityManager.find(Facture.class, id);
        if (factureExist != null) {
            System.out.println("Facture a été trouver : " + factureExist.getNum() + "  " + factureExist.getDateFacture());
            return factureExist;
        } else {
            System.out.println("Facture n'existe pas dans la BDD .");

            return null;
        }
    }

    @Override
    public Facture modifierFacture (Facture facture) {
        Facture factureExist = trouverFacture(facture.getNum());
        if (factureExist != null) {
            entityManager.getTransaction().begin();
            factureExist.setDateFacture(facture.getDateFacture());
            factureExist.setListProduit(facture.getListProduit());
            factureExist.setClientFacture(facture.getClientFacture());
            entityManager.persist(factureExist);
            entityManager.getTransaction().commit();
            System.out.println("Facture bien été modifier : " + factureExist.getNum() + "  " + factureExist.getDateFacture());
        }
        return null;
    }

    @Override
    public void supprimerFacture (Facture facture) {
        Facture factureExist = trouverFacture(facture.getNum());
        if (factureExist != null) {
            entityManager.remove(factureExist);
            System.out.println("Facture bien été supprimer de la BDD : " + factureExist.getNum());
        }
    }
}
