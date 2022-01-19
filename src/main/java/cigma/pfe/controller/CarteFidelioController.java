package cigma.pfe.controller;

import cigma.pfe.model.CarteFidelio;
import cigma.pfe.service.CarteFidelioService;
import lombok.Setter;

@Setter
public class CarteFidelioController {
    CarteFidelioService carteFidelioService;

    public void ajouterCarteFidelio (CarteFidelio carteFidelio) {
        carteFidelioService.ajouterCarteFidelio(carteFidelio);
    }

    public CarteFidelio trouverCarteFidelio (Long id) {
        return carteFidelioService.trouverCarteFidelio(id);
    }

    public CarteFidelio modifierCarteFidelio (CarteFidelio carteFidelio) {
        return carteFidelioService.modifierCarteFidelio(carteFidelio);
    }

    public void supprimerCarteFidelio (CarteFidelio carteFidelio) {
        carteFidelioService.supprimerCarteFidelio(carteFidelio);
    }

    public CarteFidelioController () {
    }

    public CarteFidelioController (CarteFidelioService carteFidelioService) {
        this.carteFidelioService = carteFidelioService;
    }
}
