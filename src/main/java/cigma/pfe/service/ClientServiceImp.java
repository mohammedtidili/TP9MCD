package cigma.pfe.service;

import cigma.pfe.dao.ClientDao;
import cigma.pfe.model.Client;
import lombok.Setter;

@Setter
public class ClientServiceImp implements ClientService {
    ClientDao clientDao;

    @Override
    public void ajouterClient (Client client) {
        clientDao.ajouterClient(client);
    }

    @Override
    public Client trouverClient (Long id) {
        return clientDao.trouverClient(id);
    }

    @Override
    public Client modifierClient (Client client) {
        return clientDao.modifierClient(client);
    }

    @Override
    public void supprimerClient (Client client) {
        clientDao.supprimerClient(client);
    }

    public ClientServiceImp () {
    }

    public ClientServiceImp (ClientDao clientDao) {
        this.clientDao = clientDao;
    }
}
