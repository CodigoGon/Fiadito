package CodigoGon.Fiadito.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@Entity
public class Deudas {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long deuda;
    private Date fechaD;
    @ManyToOne
    @JoinColumn(name = "clienteId")
    private Cliente client;

    public Deudas() {
    }

    public Deudas(Long id, Long deuda, Date fechaD, Cliente client) {
        this.id = id;
        this.deuda = deuda;
        this.fechaD = fechaD;
        this.client = client;
    }
}
