package CodigoGon.Fiadito.Service;

import CodigoGon.Fiadito.Model.Cliente;
import CodigoGon.Fiadito.Repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteRepository clienRepo;

    @Override
    public void saveCliente(Cliente cliente) {
        clienRepo.save(cliente);
    }

    @Override
    public Cliente findCliente(Long id) {
        Cliente cli = clienRepo.findById(id).orElse(null);
        return cli;
    }

    @Override
    public void deleteCliente(Long id) {
        clienRepo.deleteById(id);
    }

    @Override
    public List<Cliente> getCLientes() {
        return clienRepo.findAll();
    }

    @Override
    public void editCliente(Long idOriginal, String nombreNuevo) {
        Cliente cli = this.findCliente(idOriginal);
        cli.setNombre(nombreNuevo);

        this.saveCliente(cli);
    }
    // aqui empieza a ponerse personalizados
}
