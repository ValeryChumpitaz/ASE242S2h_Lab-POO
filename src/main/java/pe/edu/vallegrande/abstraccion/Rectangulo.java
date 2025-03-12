package pe.edu.vallegrande.abstraccion;

// Clase que representa un rectángulo y extiende de la clase abstracta Figura
public class Rectangulo extends Figura {
    // Atributos que almacenan el ancho y el alto del rectángulo
    private double ancho, alto;

    // Constructor que inicializa el ancho y el alto del rectángulo
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Método que calcula el área del rectángulo
    @Override
    public double calcularArea() {
        return ancho * alto; // Fórmula del área del rectángulo: ancho * alto
    }
}
