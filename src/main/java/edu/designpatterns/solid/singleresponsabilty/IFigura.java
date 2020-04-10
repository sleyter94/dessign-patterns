package edu.designpatterns.solid.singleresponsabilty;

public interface IFigura {
    //La clase presentación ya no necesita ser modificada para
    // mostrar los resultados de este metodo, aun cuando se agreguen mas figuras
    float getArea();
}
