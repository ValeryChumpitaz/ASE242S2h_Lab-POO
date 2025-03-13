# 🏛️ Programación Orientada a Objetos (POO) en Java  

Este proyecto es una implementación de los principales conceptos de la **Programación Orientada a Objetos (POO)** en Java.  

📌 **Principales conceptos cubiertos:**  
- 🔹 **Abstracción**  
- 🔹 **Encapsulamiento**  
- 🔹 **Herencia**  
- 🔹 **Polimorfismo**  

## 📂 Estructura del Proyecto

```bash
pe.edu.vallegrande
│── 📂 abstraccion 
│   ├── 🔵 Circulo.java 
│   ├── 🔳 Rectangulo.java
│   ├── 📐 Figura.java 
│
│── 📂 encapsulamiento 
│   ├── 🏦 CuentaBancaria.java 
│
│── 📂 herencia 
│   ├── 🧑 Persona.java 
│   ├── 🎓 Estudiante.java
│   ├── 👨‍💼 Empleado.java
│   ├── 📊 Gerente.java 
│
│── 📂 polimorfismo 
│   ├── 🐾 Animal.java 
│   ├── 🐱 Gato.java 
│   ├── 🐶 Perro.java 
│
└── 🚀 PooApplication.java

```

## 📌 Requisitos  

Antes de ejecutar el proyecto, asegúrate de tener instalados los siguientes requisitos:  

- ☕ **Java 17 o superior**  
- 🛠 **Maven**  
- 🏗 **Spring Boot**  
- 📦 **IDE recomendado:** IntelliJ IDEA, Eclipse o VS Code con soporte para Java
  
## 📖 Conceptos Aplicados  

### 🔹 Abstracción  
Se define una clase base `Figura` que es abstracta, y de ella heredan `Círculo` y `Rectángulo`, implementando sus propios métodos.  

### 🔹 Encapsulamiento  
La clase `CuentaBancaria` tiene atributos privados y métodos `getters` y `setters` para controlar el acceso a los datos.  

### 🔹 Herencia  
La clase `Persona` es la base de `Estudiante` y `Empleado`, y `Empleado` tiene una subclase `Gerente`. Esto permite reutilizar código.  

### 🔹 Polimorfismo  
La clase `Animal` tiene un método `hacerSonido()` que es sobrescrito en `Gato` y `Perro`, permitiendo múltiples comportamientos.

## 🚀 Instalación y Ejecución  

### 🔽 Clonar el repositorio  
```sh
git clone https://github.com/tu_usuario/tu_repositorio.git
cd tu_repositorio

```
## ⚙️ Compilar y ejecutar el proyecto
```sh
mvn clean install
mvn spring-boot:run
```
## 🛠 Ejemplo de Uso

```sh
public class Main {
    public static void main(String[] args) {
        Animal miGato = new Gato();
        Animal miPerro = new Perro();

        miGato.hacerSonido(); // 🐱 "Miau Miau"
        miPerro.hacerSonido(); // 🐶 "Guau Guau"
    }
}
```

# 🚀 Reto 1: Crea tu propio zoo 🦁🐍🐘  
🔹 **Objetivo:** Aplicar **herencia y polimorfismo** creando una jerarquía de animales en Java.  

## 📌 Instrucciones  
1. Crea una clase base `Animal` con un método `hacerSonido()`.  
2. Crea al menos **tres** clases hijas (`Leon`, `Serpiente`, `Elefante`), cada una con su propia versión del método `hacerSonido()`.  
3. En el `main`, crea una lista de animales y recórrela para llamar a `hacerSonido()`.  


📢 **Extra:** Agrega atributos como `habitat` o `peso` y muéstralos.  

---

# 🔥 Reto Opcional: Simulador de Cuenta Bancaria 💰  
🔹 **Objetivo:** Aplicar **encapsulamiento y abstracción** creando un sistema de cuentas bancarias en Java.  

## 📌 Instrucciones  
1. Crea una **clase abstracta** `CuentaBancaria` con un atributo `saldo` y métodos `depositar()` y `retirar()`.  
2. Crea dos clases hijas:  
   - `CuentaCorriente` (permite sobregiros)  
   - `CuentaAhorro` (no permite saldo negativo)  
3. En el `main`, crea una cuenta de cada tipo y realiza operaciones.  


📢 **Extra:** Agregar un sistema de **interés anual** para `CuentaAhorro`.  

## 📜 Licencia
### Este proyecto está bajo la licencia MIT, lo que significa que puedes usarlo, modificarlo y distribuirlo libremente.

## 🎨 **Diseño en Canva**  
Si deseas ver la explicacion de manera mas detallada, haz clic en el siguiente enlace:  

🔗 **[👉 Ver en Canva](https://www.canva.com/design/DAGhjYrNAGo/6ZX38CzNG7qRqyrh_-8z9g/edit?utm_content=DAGhjYrNAGo&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)**  


📌 **Desarrollado por:**  
#### 🔥😎 **Valery Chumpitaz** 💻🚀  
 





