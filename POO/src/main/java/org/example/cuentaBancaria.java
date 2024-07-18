package org.example;

public class cuentaBancaria {
    String titular;
    float balance;

    public cuentaBancaria(String titular, float balance) {
        this.titular = titular;
        this.balance = balance;
    }

    void ingresarDinero(float cantidad) {
        this.balance += cantidad;
    }

    void retiroDinero(float cantidad) {
        if (cantidad > this.balance) {
            System.out.println("Escoge una cantidad menor o igual a tu balance total. el cual es: "+this.balance);
        } else {
            this.balance -= cantidad;
            System.out.println("Retiro exitoso, el balance restante es de: "+this.balance);
        }
    }

    public float getBalance() {
        return balance;
    }
}