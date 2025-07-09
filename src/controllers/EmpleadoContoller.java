package controllers;

import models.Empleado;

import java.util.HashMap;

public class EmpleadoContoller {

    private EmpleadoDAO empleadoDAO;

    public EmpleadoContoller() {
        empleadoDAO = new EmpleadoDAOHashMap(new HashMap<>());
    }

    public void agregarEmpleado(Empleado empleado) {
        empleadoDAO.add(empleado);
    }

    public void eliminarEmpleado(int id) {
        empleadoDAO.remove(id);
    }

    public void listarEmpleados() {
        empleadoDAO.list();
    }

    public Empleado buscarEmpleadoPorId(int id) {

        for (Empleado empleado : ((EmpleadoDAOHashMap) empleadoDAO).empleados.values()) {
            if (empleado.getId() == id) {
                return empleado;
            }
        }
        return null;
    }
}
