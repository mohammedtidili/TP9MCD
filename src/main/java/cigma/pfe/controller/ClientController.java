package cigma.pfe.controller;

import cigma.pfe.model.Client;
import cigma.pfe.service.ClientService;
import lombok.Setter;

@Setter
public class ClientController {

    ClientService clientService;

    public void ajouterClient (Client client) {
        clientService.ajouterClient(client);
    }

    public Client trouverClient (Long id) {
        return clientService.trouverClient(id);
    }

    public Client modifierClient (Client client) {
        return clientService.modifierClient(client);
    }

    public void supprimerClient (Client client) {
        clientService.supprimerClient(client);
    }

    public ClientController () {
    }

    public ClientController (ClientService clientService) {
        this.clientService = clientService;
    }


}
