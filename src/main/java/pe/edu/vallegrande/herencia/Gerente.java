package pe.edu.vallegrande.herencia;

// Clase que representa a un gerente y extiende de la clase Empleado
public class Gerente extends Empleado {
    // Atributo privado que almacena el departamento del gerente
    private String departamento;

    // Constructor que inicializa el nombre, el salario y el departamento del gerente
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // Llama al constructor de la clase base (Empleado)
        this.departamento = departamento;
    }

    // Método que muestra los datos del gerente
    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); // Llama al método de la clase base (Empleado)
        System.out.println("Departamento: " + departamento);
    }
}
