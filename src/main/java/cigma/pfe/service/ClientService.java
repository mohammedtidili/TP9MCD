package cigma.pfe.service;

import cigma.pfe.model.Client;

public interface ClientService {

    void ajouterClient (Client client);
    Client trouverClient (Long id);
    Client modifierClient (Client client);
    void supprimerClient (Client client);
}
