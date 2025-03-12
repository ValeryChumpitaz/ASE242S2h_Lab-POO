package pe.edu.vallegrande.abstraccion;

public class Rectangulo extends Figura {
    private double ancho, alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
