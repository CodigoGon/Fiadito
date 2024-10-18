package CodigoGon.Fiadito.Service;

import CodigoGon.Fiadito.Model.Deudas;
import CodigoGon.Fiadito.Repository.IDeudasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DeudasService implements IDeudasService{

    @Autowired
    private IDeudasRepository repoDeuda;

    @Override
    public void saveDeudas(Deudas deuda) {
        repoDeuda.save(deuda);
    }

    @Override
    public Deudas findDeuda(Long id) {
        Deudas deu = repoDeuda.findById(id).orElse(null);
        return deu;
    }

    @Override
    public void deleteDeudas(Long id) {
        repoDeuda.deleteById(id);
    }

    @Override
    public List<Deudas> getDeudas() {
        List<Deudas> deuLi = repoDeuda.findAll();
        return deuLi;
    }

    @Override
    public void editDeudas(Long idOriginal, Long DeudaNueva, Date fechaNueva) {
        Deudas deu = this.findDeuda(idOriginal);
        deu.setDeuda(DeudaNueva);
        deu.setFechaD(fechaNueva);
        this.saveDeudas(deu);
    }
    // ahora los personalizados aqui
}
