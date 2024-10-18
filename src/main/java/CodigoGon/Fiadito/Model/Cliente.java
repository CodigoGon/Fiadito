package CodigoGon.Fiadito.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;

@Getter @Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    @OneToMany
    @Cascade(CascadeType.REMOVE)
    private List<Deudas> deudas;
    @OneToMany
    @Cascade(CascadeType.REMOVE)
    private List<Pagos> pagos;

    public Cliente() {
    }

    public Cliente(Long id, String nombre, List<Deudas> deudas, List<Pagos> pagos) {
        this.id = id;
        this.nombre = nombre;
        this.deudas = deudas;
        this.pagos = pagos;
    }
}
