package cigma.pfe.dao;

import cigma.pfe.model.Client;

public interface ClientDao {

    void ajouterClient (Client client);
    Client trouverClient (Long id);
    Client modifierClient (Client client);
    void supprimerClient (Client client);


}
