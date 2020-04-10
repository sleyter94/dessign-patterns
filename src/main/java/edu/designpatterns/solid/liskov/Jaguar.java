package edu.designpatterns.solid.liskov;

import edu.designpatterns.solid.interfacesegregation.IFelinoSalvaje;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Jaguar implements IFelinoSalvaje {

    @Override
    public void rugir() {
        System.out.println("El jaguar ruge");
    }

    @Override
    public void cazar() {
        System.out.println("El jaguar caza");
    }
}
