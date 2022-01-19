package cigma.pfe.service;

import cigma.pfe.dao.FactureDao;
import cigma.pfe.model.Facture;
import lombok.Setter;

@Setter
public class FactureServiceImp implements FactureService {

    FactureDao factureDao;

    @Override
    public void ajouterFacture (Facture facture) {
        factureDao.ajouterFacture(facture);
    }

    @Override
    public Facture trouverFacture (Long id) {
        return factureDao.trouverFacture(id);
    }

    @Override
    public Facture modifierFacture (Facture facture) {
        return factureDao.modifierFacture(facture);
    }

    @Override
    public void supprimerFacture (Facture facture) {
        factureDao.supprimerFacture(facture);
    }

    public FactureServiceImp () {
    }

    public FactureServiceImp (FactureDao factureDao) {
        this.factureDao = factureDao;
    }
}
