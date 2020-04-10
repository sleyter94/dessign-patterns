package edu.designpatterns.creational.singleton;

public class ConexionDB {

    private static ConexionDB conexion;
    public String host;

    private ConexionDB(){

    }

    //synchronized make singleton Thread Safe
    public synchronized static ConexionDB getConexion(){
        if(conexion == null){
            conexion = new ConexionDB();
        }
        return conexion;
    }
}
