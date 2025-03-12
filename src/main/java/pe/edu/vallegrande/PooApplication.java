package pe.edu.vallegrande;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.vallegrande.abstraccion.Circulo;
import pe.edu.vallegrande.abstraccion.Rectangulo;
import pe.edu.vallegrande.encapsulamiento.CuentaBancaria;
import pe.edu.vallegrande.herencia.Estudiante;
import pe.edu.vallegrande.polimorfismo.Animal;
import pe.edu.vallegrande.polimorfismo.Gato;
import pe.edu.vallegrande.polimorfismo.Perro;


@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);

		System.out.println("🔷 Ejecutando ejemplos de POO en Java...\n");

		// Demostración de cada concepto
		ejecutarEncapsulamiento();
		ejecutarHerencia();
		ejecutarPolimorfismo();
		ejecutarAbstraccion();
	}

	/**
	 * 🔹 Ejemplo de Encapsulamiento
	 * Se crea una cuenta bancaria con saldo inicial,
	 * luego se realizan depósitos y retiros.
	 */
	private static void ejecutarEncapsulamiento() {
		System.out.println("🔹 Ejemplo de Encapsulamiento:");
		CuentaBancaria cuenta = new CuentaBancaria(1000);
		cuenta.depositar(500);
		cuenta.retirar(200);
		System.out.println("Saldo actual: " + cuenta.getSaldo() + "\n");
	}

	/**
	 * 🔹 Ejemplo de Herencia
	 * Se crea un objeto `Estudiante`, que hereda de `Persona`,
	 * y se muestra su información.
	 */
	private static void ejecutarHerencia() {
		System.out.println("🔹 Ejemplo de Herencia:");
		Estudiante estudiante = new Estudiante("Valery", 20, "123456");
		estudiante.mostrarInformacion();
	}

	/**
	 * 🔹 Ejemplo de Polimorfismo
	 * Se crean instancias de `Perro` y `Gato` como `Animal`
	 * y se llama al método `hacerSonido()`.
	 */
	private static void ejecutarPolimorfismo() {
		System.out.println("\n🔹 Ejemplo de Polimorfismo:");
		Animal perro = new Perro();
		Animal gato = new Gato();
		perro.hacerSonido();
		gato.hacerSonido();
	}

	/**
	 * 🔹 Ejemplo de Abstracción
	 * Se crean objetos de `Circulo` y `Rectangulo`,
	 * y se calcula el área de cada uno.
	 */
	private static void ejecutarAbstraccion() {
		System.out.println("\n🔹 Ejemplo de Abstracción:");
		Circulo circulo = new Circulo(5);
		Rectangulo rectangulo = new Rectangulo(4, 6);
		System.out.println("Área del círculo: " + circulo.calcularArea());
		System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
	}
}
