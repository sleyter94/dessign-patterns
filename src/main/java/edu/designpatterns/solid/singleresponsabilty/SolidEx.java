package edu.designpatterns.solid.singleresponsabilty;

public class SolidEx {

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(20,10);
        Triangulo triangulo = new Triangulo(10,10);
        Presentacion presentacion = new Presentacion();
        presentacion.imprimir(rectangulo);
        presentacion.imprimir(triangulo);

    }
}
