package cigma.pfe.service;

import cigma.pfe.model.Produit;

public interface ProduitService {

    void ajouterProduit (Produit produit);
    Produit trouverProduit (Long id);
    Produit modifierProduit (Produit produit);
    void supprimerProduit (Produit produit);
}
