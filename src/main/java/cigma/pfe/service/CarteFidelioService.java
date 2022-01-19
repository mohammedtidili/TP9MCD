package cigma.pfe.service;

import cigma.pfe.model.CarteFidelio;

public interface CarteFidelioService {

    void ajouterCarteFidelio(CarteFidelio carteFidelio);
    CarteFidelio trouverCarteFidelio(Long id);
    CarteFidelio modifierCarteFidelio(CarteFidelio carteFidelio);
    void supprimerCarteFidelio(CarteFidelio carteFidelio);
}
