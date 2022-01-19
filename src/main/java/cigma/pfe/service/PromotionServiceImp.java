package cigma.pfe.service;

import cigma.pfe.dao.PromotionDao;
import cigma.pfe.model.Promotion;
import lombok.Setter;

@Setter
public class PromotionServiceImp implements PromotionService {
    PromotionDao promotionDao;

    @Override
    public void ajouterPromotion (Promotion promotion) {
        promotionDao.ajouterPromotion(promotion);
    }

    @Override
    public Promotion TrouverPromotion (Long id) {
        return promotionDao.trouverPromotion(id);
    }

    @Override
    public Promotion modifierPromotion (Promotion promotion) {
        return promotionDao.modifierPromotion(promotion);
    }

    @Override
    public void supprimerPromotion (Promotion promotion) {
        promotionDao.supprimerPromotion(promotion);
    }

    public PromotionServiceImp () {
    }

    public PromotionServiceImp (PromotionDao promotionDao) {
        this.promotionDao = promotionDao;
    }
}
