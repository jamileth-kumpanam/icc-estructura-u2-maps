package controllers;

import java.util.TreeMap;

import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {

    private TreeMap<Empleado, Empleado> empleados;

    public EmpleadoDAOTreeMap() {
        empleados = new TreeMap<>(); 
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