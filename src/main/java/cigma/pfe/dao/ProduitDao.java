package cigma.pfe.dao;

import cigma.pfe.model.Produit;

public interface ProduitDao {

    void ajouterProduit (Produit produit);
    Produit trouverProduit (Long id);
    Produit modifierProduit (Produit produit);
    void supprimerProduit (Produit produit);

}
