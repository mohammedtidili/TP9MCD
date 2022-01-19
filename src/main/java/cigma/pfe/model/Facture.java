package cigma.pfe.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;
    private Date dateFacture;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @Basic(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_num")
    private Client clientFacture;
    @ManyToMany(cascade = CascadeType.PERSIST,mappedBy = "listFacture")
    @Basic(fetch = FetchType.EAGER)
    private List<Produit> listProduit;

    public Facture () {
    }

    public Facture (Date dateFacture, Client clientFacture, List<Produit> listProduit) {
        this.dateFacture = dateFacture;
        this.clientFacture = clientFacture;
        this.listProduit = listProduit;
    }

    public Facture (Long num, Date dateFacture, Client clientFacture, List<Produit> listProduit) {
        this.num = num;
        this.dateFacture = dateFacture;
        this.clientFacture = clientFacture;
        this.listProduit = listProduit;
    }

}
