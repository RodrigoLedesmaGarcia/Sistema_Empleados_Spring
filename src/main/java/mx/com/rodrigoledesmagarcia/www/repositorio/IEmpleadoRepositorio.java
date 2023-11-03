package mx.com.rodrigoledesmagarcia.www.repositorio;

import mx.com.rodrigoledesmagarcia.www.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRepositorio extends JpaRepository<Empleado, Integer> {

}
