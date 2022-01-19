package cigma.pfe.controller;

import cigma.pfe.model.Promotion;
import cigma.pfe.service.PromotionService;
import lombok.Setter;

@Setter
public class PromotionController {

    PromotionService promotionService;

    public void ajouterPromotion (Promotion promotion) {
        promotionService.ajouterPromotion(promotion);

    }

    public Promotion trouverPromotion (Long id) {
        return promotionService.TrouverPromotion(id);
    }

    public Promotion modifierPromotion (Promotion promotion) {

        return promotionService.modifierPromotion(promotion);
    }

    public void supprimerPromotion (Promotion promotion) {
        promotionService.supprimerPromotion(promotion);
    }

    public PromotionController () {
    }

    public PromotionController (PromotionService promotionService) {
        this.promotionService = promotionService;
    }
}
