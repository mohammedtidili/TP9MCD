package cigma.pfe.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;
    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private String telephone;
    private String genre;
    private String address;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientFacture")
    @Basic(fetch = FetchType.EAGER)
    private List<Facture> facture;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "ListClientPromotion")
    @Basic(fetch = FetchType.EAGER)
    private List<Promotion> listPromotion;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "clientCarteFidelio")
    @Basic(fetch = FetchType.EAGER)
    private CarteFidelio clientCarte;

    public Client () {

    }

    public Client (String nom, String prenom, Date dateDeNaissance, String telephone, String genre, String address, List<Facture> facture, List<Promotion> listPromotion, CarteFidelio clientCarte) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.telephone = telephone;
        this.genre = genre;
        this.address = address;
        this.facture = facture;
        this.listPromotion = listPromotion;
        this.clientCarte = clientCarte;
    }

    public Client (Long num, String nom, String prenom, Date dateDeNaissance, String telephone, String genre, String address, List<Facture> facture, List<Promotion> listPromotion, CarteFidelio clientCarte) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.telephone = telephone;
        this.genre = genre;
        this.address = address;
        this.facture = facture;
        this.listPromotion = listPromotion;
        this.clientCarte = clientCarte;
    }
}
