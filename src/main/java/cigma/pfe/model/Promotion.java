package cigma.pfe.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;
    private String description;
    @ManyToMany(cascade = CascadeType.REFRESH)
    @Basic(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_num")
    private List<Client> ListClientPromotion;

    public Promotion () {
    }

    public Promotion (String description, List<Client> listClientPromotion) {
        this.description = description;
        ListClientPromotion = listClientPromotion;
    }

    public Promotion (Long num, String description, List<Client> listClientPromotion) {
        this.num = num;
        this.description = description;
        ListClientPromotion = listClientPromotion;
    }
}
