package cigma.pfe.dao;

import cigma.pfe.model.Facture;

public interface FactureDao {

    void ajouterFacture (Facture facture);
    Facture trouverFacture (Long id);
    Facture modifierFacture (Facture facture);
    void supprimerFacture (Facture facture);

}
