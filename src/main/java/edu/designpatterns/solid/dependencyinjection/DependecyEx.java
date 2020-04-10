package edu.designpatterns.solid.dependencyinjection;

public class DependecyEx {

    public static void main(String[] args) {
        ITeclado teclado = new Teclado();
        IMouse mouse = new Mouse();
        Computadora computadora = new Computadora(teclado, mouse);
        computadora.encender();
    }
}
