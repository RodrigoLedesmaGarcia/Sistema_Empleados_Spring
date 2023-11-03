package mx.com.rodrigoledesmagarcia.www.servicio;

import mx.com.rodrigoledesmagarcia.www.EmpleadosApplication;
import mx.com.rodrigoledesmagarcia.www.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {

    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPorId(Integer idEmpleado);

    public void guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);
}
