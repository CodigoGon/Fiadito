package CodigoGon.Fiadito.Repository;


import CodigoGon.Fiadito.Model.Pagos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPagosRepository extends JpaRepository<Pagos,Long> {
}
