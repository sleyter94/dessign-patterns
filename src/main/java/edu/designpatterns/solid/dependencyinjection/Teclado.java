package edu.designpatterns.solid.dependencyinjection;

public class Teclado implements ITeclado{
    @Override
    public void conectar() {
        System.out.println("Teclado conectado");
    }
}
