package CodigoGon.Fiadito.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ClienteDTO {
    private String nombre;
    private Long totalDeuda;
    private Long totalPago;
    private Long balance;

    public ClienteDTO() {
    }

    public ClienteDTO(String nombre, Long totalDeuda, Long totalPago, Long balance) {
        this.nombre = nombre;
        this.totalDeuda = totalDeuda;
        this.totalPago = totalPago;
        this.balance = balance;
    }
}
