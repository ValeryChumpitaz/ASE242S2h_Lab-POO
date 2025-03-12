package pe.edu.vallegrande.encapsulamiento;

public class CuentaBancaria {
    // Atributo privado que almacena el saldo de la cuenta bancaria
    private double saldo;

    // Constructor que inicializa el saldo de la cuenta bancaria
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método que permite depositar un monto en la cuenta bancaria
    public void depositar(double monto) {
        saldo += monto;
    }

    // Método que permite retirar un monto de la cuenta bancaria
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    // Método que devuelve el saldo actual de la cuenta bancaria
    public double getSaldo() {
        return saldo;
    }
}
