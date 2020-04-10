package edu.designpatterns.solid.dependencyinjection;

public class Mouse implements IMouse{
    @Override
    public void conectar() {
        System.out.println("Mouse conectado");
    }
}
