package cigma.pfe.dao;

import cigma.pfe.model.Promotion;

public interface PromotionDao {

    void ajouterPromotion (Promotion promotion);
    Promotion trouverPromotion (Long id);
    Promotion modifierPromotion (Promotion promotion);
    void supprimerPromotion (Promotion promotion);

}
