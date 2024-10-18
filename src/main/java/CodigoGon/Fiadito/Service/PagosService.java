package CodigoGon.Fiadito.Service;

import CodigoGon.Fiadito.Model.Pagos;
import CodigoGon.Fiadito.Repository.IPagosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PagosService implements IPagosService{

    @Autowired
    IPagosRepository repoPago;

    @Override
    public void savePago(Pagos Pago) {
        repoPago.save(Pago);
    }

    @Override
    public Pagos findPago(Long id) {
        Pagos pago =  repoPago.findById(id).orElse(null);
        return pago;
    }

    @Override
    public void deletePago(Long id) {
        repoPago.deleteById(id);
    }

    @Override
    public List<Pagos> getPagos() {
        List<Pagos> pagoLi = repoPago.findAll();
        return  pagoLi;
    }

    @Override
    public void editPago(Long idOriginal, Long nuevoPago, Date fechaNueva) {
        Pagos pag = this.findPago(idOriginal);
        pag.setPago(nuevoPago);
        pag.setFechaP(fechaNueva);
        this.savePago(pag);
    }
}
