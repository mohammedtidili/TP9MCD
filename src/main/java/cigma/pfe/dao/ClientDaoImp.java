package cigma.pfe.dao;

import cigma.pfe.model.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientDaoImp implements ClientDao {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Mcd_exercise");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void ajouterClient (Client client) {

        entityManager.getTransaction().begin();
        entityManager.persist(client);
        entityManager.getTransaction().commit();
        System.out.println("Client bien été enregister  : " + client.getNom() + "  " + client.getPrenom());

    }

    @Override
    public Client trouverClient (Long id) {
        Client clientExist = entityManager.find(Client.class, id);
        if (clientExist != null) {
            System.out.println("Client trouver : " + clientExist.getNom() + "   " + clientExist.getPrenom());
            return clientExist;
        } else {
            System.out.println("Client n'existe pas dans la BDD .");
            return null;
        }
    }

    @Override
    public Client modifierClient (Client client) {

        Client clientExist = trouverClient(client.getNum());
        if (clientExist != null) {
            entityManager.getTransaction().begin();
            clientExist.setNom(client.getNom());
            clientExist.setPrenom(client.getPrenom());
            clientExist.setDateDeNaissance(client.getDateDeNaissance());
            clientExist.setTelephone(client.getTelephone());
            clientExist.setGenre(client.getGenre());
            clientExist.setAddress(client.getAddress());
            clientExist.setFacture(client.getFacture());
            clientExist.setListPromotion(client.getListPromotion());
            clientExist.setClientCarte(client.getClientCarte());
            System.out.println("Client bien été modifier : " + clientExist.getNom() + "  " + clientExist.getPrenom());
            entityManager.persist(clientExist);
            entityManager.getTransaction().commit();
        }

        return null;
    }

    @Override
    public void supprimerClient (Client client) {
        Client clientExist = trouverClient(client.getNum());
        if (clientExist != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(clientExist);
            System.out.println("Client bien été supprimer : " + clientExist.getNom() + "  " + clientExist.getPrenom());
            entityManager.getTransaction().commit();
        }
    }
}


