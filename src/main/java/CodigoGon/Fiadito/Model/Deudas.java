package CodigoGon.Fiadito.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Deudas {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long deuda;

    public Deudas() {
    }

    public Deudas(Long id, Long deuda) {
        this.id = id;
        this.deuda = deuda;
    }
}
