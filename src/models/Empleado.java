package models;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public int compareTo(Empleado otro) {
        return Integer.compare(this.id, otro.id);
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + name + "', puesto='" + position + "'}";
    }
}
