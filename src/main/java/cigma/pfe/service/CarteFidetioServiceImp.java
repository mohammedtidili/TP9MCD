package cigma.pfe.service;

import cigma.pfe.dao.CarteFidelioDao;
import cigma.pfe.model.CarteFidelio;
import lombok.Setter;

@Setter
public class CarteFidetioServiceImp implements CarteFidelioService {

    CarteFidelioDao carteFidelioDao;

    @Override
    public void ajouterCarteFidelio (CarteFidelio carteFidelio) {
        carteFidelioDao.ajouterCarteFidelio(carteFidelio);
    }

    @Override
    public CarteFidelio trouverCarteFidelio (Long id) {
        return carteFidelioDao.trouverCarteFidelio(id);
    }

    @Override
    public CarteFidelio modifierCarteFidelio (CarteFidelio carteFidelio) {
        return carteFidelioDao.modifierCarteFidelio(carteFidelio);
    }

    @Override
    public void supprimerCarteFidelio (CarteFidelio carteFidelio) {
        carteFidelioDao.supprimerCarteFidelio(carteFidelio);
    }

    public CarteFidetioServiceImp () {
    }

    public CarteFidetioServiceImp (CarteFidelioDao carteFidelioDao) {
        this.carteFidelioDao = carteFidelioDao;
    }
}
