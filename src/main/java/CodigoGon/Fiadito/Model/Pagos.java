package CodigoGon.Fiadito.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@Entity
public class Pagos {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long pago;
    private Date fechaP;
    @ManyToOne
    @JoinColumn(name = "clienteId")
    private Cliente client;

    public Pagos() {
    }

    public Pagos(Long id, Long pago, Date fechaP, Cliente client) {
        this.id = id;
        this.pago = pago;
        this.fechaP = fechaP;
        this.client = client;
    }
}

