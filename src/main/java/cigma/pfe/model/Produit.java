package cigma.pfe.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;
    private String designation;
    private Float prix;
    private Integer stock;
    @ManyToMany(cascade = CascadeType.REFRESH)
    @Basic(fetch = FetchType.EAGER)
    @JoinColumn(name = "produit_num")
    private List<Facture> listFacture;

    public Produit () {
    }

    public Produit (String designation, Float prix, Integer stock, List<Facture> listFacture) {
        this.designation = designation;
        this.prix = prix;
        this.stock = stock;
        this.listFacture = listFacture;
    }
}
