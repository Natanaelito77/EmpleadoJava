import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Clase principal para el registro y visualización de empleados
class App {
    public App(int id, String nombre, String apellido, String departamento, double salario) {

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        String continuar;

        do {
            System.out.println("Ingrese los datos del empleado:");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Departamento: ");
            String departamento = scanner.nextLine();
            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer

            // Crear y añadir empleado a la lista
            Empleado empleado = new Empleado(id, nombre, apellido, departamento, salario);
            listaEmpleados.add(empleado);

            System.out.print("¿Desea agregar otro empleado? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        // Mostrar empleados registrados usando Iterator
        System.out.println("Empleados registrados:");
        Iterator<Empleado> iteratorEmpleado = listaEmpleados.iterator();
        while (iteratorEmpleado.hasNext()) {
            Empleado empleado = iteratorEmpleado.next();
            System.out.println(empleado);
        }




    }
}
