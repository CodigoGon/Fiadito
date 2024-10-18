package CodigoGon.Fiadito.Service;

import CodigoGon.Fiadito.Model.Cliente;
import CodigoGon.Fiadito.Model.Deudas;

import java.util.Date;
import java.util.List;

public interface IDeudasService {

    public void saveDeudas (Deudas deuda);

    public Deudas findDeuda (Long id);

    public void deleteDeudas (Long id);

    public List<Deudas> getDeudas();

    public void editDeudas(Long idOriginal, Long DeudaNueva, Date fechaNueva);
}
