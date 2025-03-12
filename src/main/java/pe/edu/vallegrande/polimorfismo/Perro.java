package pe.edu.vallegrande.polimorfismo;

// 🔹 Polimorfismo (Subclase)
public class Gato extends Animal {
    // Método que hace el sonido específico de un gato
    @Override
    public void hacerSonido() {
        System.out.println("Miau miau!");
    }
}

// 🔹 Polimorfismo (Subclase)
public class Perro extends Animal {
    // Método que hace el sonido específico de un perro
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }
}

