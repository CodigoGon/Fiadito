package CodigoGon.Fiadito.Repository;


import CodigoGon.Fiadito.Model.Deudas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeudasRepository extends JpaRepository<Deudas, Long> {

}
