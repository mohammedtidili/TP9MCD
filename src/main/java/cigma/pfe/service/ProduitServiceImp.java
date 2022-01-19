package cigma.pfe.service;

import cigma.pfe.dao.ProduitDao;
import cigma.pfe.model.Produit;
import lombok.Setter;

@Setter
public class ProduitServiceImp implements ProduitService {

    ProduitDao produitDao;

    @Override
    public void ajouterProduit (Produit produit) {
        produitDao.ajouterProduit(produit);
    }

    @Override
    public Produit trouverProduit (Long id) {
        return produitDao.trouverProduit(id);
    }

    @Override
    public Produit modifierProduit (Produit produit) {
        return produitDao.modifierProduit(produit);
    }

    @Override
    public void supprimerProduit (Produit produit) {
        produitDao.supprimerProduit(produit);
    }

    public ProduitServiceImp () {
    }

    public ProduitServiceImp (ProduitDao produitDao) {
        this.produitDao = produitDao;
    }
}
