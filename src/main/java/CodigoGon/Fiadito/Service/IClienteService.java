package CodigoGon.Fiadito.Service;

import CodigoGon.Fiadito.Model.Cliente;

import java.util.List;

public interface IClienteService {

    public void saveCliente (Cliente cliente);

    public Cliente findCliente (Long id);

    public void deleteCliente (Long id);

    public List<Cliente> getCLientes();

    public void editCliente(Long idOriginal, String nombreNuevo);
}
