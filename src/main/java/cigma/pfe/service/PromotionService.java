package cigma.pfe.service;

import cigma.pfe.model.Promotion;

public interface PromotionService {

    void ajouterPromotion (Promotion promotion);
    Promotion TrouverPromotion (Long id);
    Promotion modifierPromotion (Promotion promotion);
    void supprimerPromotion (Promotion promotion);

}
