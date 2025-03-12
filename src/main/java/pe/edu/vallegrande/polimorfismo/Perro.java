package pe.edu.vallegrande.polimorfismo;

// 🔹 Polimorfismo (Subclase)
public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }
}
