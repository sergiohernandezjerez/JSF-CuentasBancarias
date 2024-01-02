package thefundidors.cuentas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import thefundidors.cuentas.modelo.Cuenta;

public interface CuentaRepositorio extends JpaRepository<Cuenta, Integer> {

}
