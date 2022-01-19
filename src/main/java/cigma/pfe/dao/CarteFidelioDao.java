package cigma.pfe.dao;

import cigma.pfe.model.CarteFidelio;

public interface CarteFidelioDao {

    void ajouterCarteFidelio (CarteFidelio carteFidelio);
    CarteFidelio trouverCarteFidelio (Long id);
    CarteFidelio modifierCarteFidelio (CarteFidelio carteFidelio);
    void supprimerCarteFidelio (CarteFidelio carteFidelio);


}
