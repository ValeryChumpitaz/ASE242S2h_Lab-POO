//📌 Objetivo: Crear una jerarquía donde Gerente herede de Empleado.

package pe.edu.vallegrande.herencia;

public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}
