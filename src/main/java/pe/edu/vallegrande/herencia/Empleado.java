package pe.edu.vallegrande.herencia;

// Clase que representa a un empleado (📌Clase Padre)
public class Empleado {
    // Atributos protegidos que almacenan el nombre y el salario del empleado
    protected String nombre;
    protected double salario;

    // Constructor que inicializa el nombre y el salario del empleado
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método que muestra los datos del empleado
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}
