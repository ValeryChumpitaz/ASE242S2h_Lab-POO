package pe.edu.vallegrande.herencia;

// 🔹 Clase base (Padre)
public class Persona {
    // Atributos protegidos que almacenan el nombre y la edad de la persona
    protected String nombre;
    protected int edad;

    // Constructor que inicializa el nombre y la edad de la persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método que muestra la información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
