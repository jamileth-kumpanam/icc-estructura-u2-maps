package controllers;
import java.util.HashMap;


import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    HashMap<Empleado,Empleado> empleados;

    public EmpleadoDAOHashMap(HashMap<Empleado, Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
    
    }

    @Override
    public void remove(int id) {
       empleados.remove(id);
    }

    @Override
    public void list() {
       if (empleados.isEmpty()) {
        System.out.println("No hay empleados registrados.");
    } else {
        System.out.println("Lista de empleados:");
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado);
        }
    }
    }

    
}