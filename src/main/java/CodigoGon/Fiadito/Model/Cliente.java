package CodigoGon.Fiadito.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    @OneToMany
    private List<Deudas> deudas;
    @OneToMany
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
