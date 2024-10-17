package CodigoGon.Fiadito.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Pagos {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long pago;

    public Pagos() {
    }

    public Pagos(Long id, Long pago) {
        this.id = id;
        this.pago = pago;
    }
}

