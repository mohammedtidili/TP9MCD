package cigma.pfe.controller;

import cigma.pfe.model.Facture;
import cigma.pfe.service.FactureService;
import lombok.Setter;

@Setter
public class FactureController {

    FactureService factureService;

    public void ajouterFacture (Facture facture) {
        factureService.ajouterFacture(facture);
    }

    public Facture trouverFacture (Long id) {
        return factureService.trouverFacture(id);
    }

    public Facture modifierFacture (Facture facture) {
        return factureService.modifierFacture(facture);

    }

    public void supprimerFacture (Facture facture) {
        factureService.supprimerFacture(facture);
    }

    public FactureController () {
    }

    public FactureController (FactureService factureService) {
        this.factureService = factureService;
    }
}
