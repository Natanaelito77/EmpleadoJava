// Clase Empleado con encapsulamiento
public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private String departamento;
    private double salario;


    // Constructor
    public Empleado(int id, String nombre, String apellido, String departamento, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
        this.salario = salario;
    }

    // Getters y Setters
    // ... Métodos getters y setters para cada atributo ...

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +

                '}';
    }
}
