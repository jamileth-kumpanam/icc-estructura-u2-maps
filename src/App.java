import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        runMapExamlpe();

        runEmpleadoExample();

        runEjercicios(); // Corrección aquí

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

    private static void runEjercicios() {
        Ejercicios ejercicios = new Ejercicios();

        // Ejercicio 1: Anagramas
        String str1 = "amor";
        String str2 = "roma";
        boolean sonAnagramas = Ejercicios.areAnagrams(str1, str2);
        System.out.println("¿Son anagramas '" + str1 + "' y '" + str2 + "'? " + sonAnagramas);

        // Ejercicio 2: Suma de dos números
        int[] nums = {2, 7, 11, 15};
        int objetivo = 9;
        int[] indices = ejercicios.sumatoriaDeDos(nums, objetivo);
        if (indices != null) {
            System.out.println("Índices de los números que suman " + objetivo + ": " + indices[0] + ", " + indices[1]);
        } else {
            System.out.println("No se encontraron dos números que sumen " + objetivo);
        }

        // Ejercicio 3: Contar caracteres
        String texto = "hola mundo";
        System.out.println("Frecuencia de caracteres en '" + texto + "':");
        ejercicios.contarCaracteres(texto);

        // Ejercicio 4: sonAnagramas (no estático)
        boolean sonAnagramas2 = ejercicios.sonAnagramas("roma", "amor");
        System.out.println("¿'roma' y 'amor' son anagramas? " + sonAnagramas2);
    }
}