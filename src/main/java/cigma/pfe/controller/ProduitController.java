package cigma.pfe.controller;

import cigma.pfe.model.Produit;
import cigma.pfe.service.ProduitService;
import lombok.Setter;

@Setter
public class ProduitController {

    ProduitService produitService;

    public void ajouterProduit (Produit produit) {
        produitService.ajouterProduit(produit);
    }

    public Produit trouverProduit (Long id) {

        return produitService.trouverProduit(id);
    }

    public Produit modifierProduit (Produit produit) {
        return produitService.modifierProduit(produit);
    }

    public void supprimerProduit (Produit produit) {
        produitService.supprimerProduit(produit);
    }

    public ProduitController () {
    }

    public ProduitController (ProduitService produitService) {
        this.produitService = produitService;
    }
}
