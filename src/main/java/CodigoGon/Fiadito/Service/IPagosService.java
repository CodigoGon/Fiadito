package CodigoGon.Fiadito.Service;

import CodigoGon.Fiadito.Model.Cliente;
import CodigoGon.Fiadito.Model.Pagos;

import java.util.Date;
import java.util.List;

public interface IPagosService {

    public void savePago (Pagos Pago);

    public Pagos findPago (Long id);

    public void deletePago (Long id);

    public List<Pagos> getPagos();

    public void editPago(Long idOriginal, Long nuevoPago, Date fechaNueva);
}
