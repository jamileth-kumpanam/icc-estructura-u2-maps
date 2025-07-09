import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller controlador = new EmpleadoContoller();

        Empleado e1 = new Empleado(1, "Ana", "Contadora");
        Empleado e2 = new Empleado(2, "Luis", "Ingeniero");
        Empleado e3 = new Empleado(3, "Marta", "Diseñadora");
        Empleado e4 = new Empleado(4, "Carlos", "Administrador");

        controlador.agregarEmpleado(e1);
        controlador.agregarEmpleado(e2);
        controlador.agregarEmpleado(e3);
        controlador.agregarEmpleado(e4);

        System.out.println("--- Lista de empleados ---");
        controlador.listarEmpleados();

        System.out.println("--- Buscar empleado con ID = 3 ---");
        Empleado temp = controlador.buscarEmpleadoPorId(3);
        if (temp != null) {
            System.out.println("Empleado encontrado: " + temp);
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
    }

    private static void runEjerccios() {
        System.out.println("Ejercicios aún no implementados.");
    }
}
