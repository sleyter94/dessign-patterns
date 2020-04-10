package edu.designpatterns.solid.dependencyinjection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Computadora {

    //No debe depender de un clase concreta, sino de una abstracciòn(interface)
    private ITeclado teclado;
    private IMouse mouse;

    public void encender(){
        this.teclado.conectar();
        this.mouse.conectar();
    }
}
