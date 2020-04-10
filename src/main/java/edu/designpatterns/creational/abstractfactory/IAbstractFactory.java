package edu.designpatterns.creational.abstractfactory;

public interface IAbstractFactory {

    IComputadora crearComputadora();

    ITablet crearTablet();
}
