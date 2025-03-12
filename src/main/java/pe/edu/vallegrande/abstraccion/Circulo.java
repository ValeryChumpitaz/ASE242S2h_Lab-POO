package pe.edu.vallegrande.abstraccion;

// Clase que representa un círculo y extiende de la clase abstracta Figura
public class Circulo extends Figura {
    // Atributo que almacena el radio del círculo
    private double radio;

    // Constructor que inicializa el radio del círculo
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método que calcula el área del círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; // Fórmula del área del círculo: π * radio^2
    }
}
