package cigma.pfe.model;

import lombok.Data;
import net.bytebuddy.build.Plugin;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Data
@Entity
public class CarteFidelio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;
    private String code;
    @OneToOne(cascade = CascadeType.PERSIST)
    @Basic(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_num")
    private  Client clientCarteFidelio;

    public CarteFidelio () {
    }

    public CarteFidelio (String code, Client clientCarteFidelio) {
        this.code = code;
        this.clientCarteFidelio = clientCarteFidelio;
    }

    public CarteFidelio (Long num, String code, Client clientCarteFidelio) {
        this.num = num;
        this.code = code;
        this.clientCarteFidelio = clientCarteFidelio;
    }
}
