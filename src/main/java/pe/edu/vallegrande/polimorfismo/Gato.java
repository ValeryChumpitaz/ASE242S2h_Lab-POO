package pe.edu.vallegrande.polimorfismo;

// 🔹 Polimorfismo (Subclase)
public class Gato extends Animal {
    // Método que hace el sonido específico de un gato , el Override permite sobreescribir para realizar su propia implementacion
    @Override 
    public void hacerSonido() {
        System.out.println("Miau miau!");
    }
}
