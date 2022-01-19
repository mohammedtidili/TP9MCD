package cigma.pfe.service;

import cigma.pfe.model.Facture;

public interface FactureService {

    void ajouterFacture (Facture facture);
    Facture trouverFacture (Long id);
    Facture modifierFacture (Facture facture);
    void supprimerFacture (Facture facture);
}
