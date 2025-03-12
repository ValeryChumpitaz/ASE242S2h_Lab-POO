package pe.edu.vallegrande.herencia;

// 🔹 Clase derivada (Hija)
public class Estudiante extends Persona {
    // Atributo privado que almacena la matrícula del estudiante
    private String matricula;

    // Constructor que inicializa el nombre, la edad y la matrícula del estudiante
    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad); // Llama al constructor de la clase base (Persona)
        this.matricula = matricula;
    }

    // Método que muestra la información del estudiante
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la clase base (Persona)
        System.out.println("Matrícula: " + matricula);
    }
}
