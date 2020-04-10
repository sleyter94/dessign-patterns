package edu.designpatterns.creational.singleton;

public class SingletonEx {

    public static void main(String[] args) {
        ConexionDB conexion = ConexionDB.getConexion();
        ConexionDB conexion2 = ConexionDB.getConexion();
        ConexionDB conexion3 = ConexionDB.getConexion();
        ConexionDB conexion4 = ConexionDB.getConexion();

        conexion.host = "localhost";
        //THE SAME FOR ALL OF THESE
        System.out.println(conexion.hashCode());
        System.out.println(conexion2.hashCode());
        System.out.println(conexion3.hashCode());
        System.out.println(conexion4.hashCode());

        //THE SAME FOR ALL OF THESE
        System.out.println(conexion.host);
        System.out.println(conexion2.host);
        System.out.println(conexion3.host);
        System.out.println(conexion4.host);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConexionDB conexionT1 = ConexionDB.getConexion();
                System.out.println(conexionT1.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConexionDB conexionT2 = ConexionDB.getConexion();
                System.out.println(conexionT2.hashCode());
            }
        });

        //CURRENT IMPLEMENTATION IS NOT THREAD SAFE
        t1.start();
        t2.start();

    }
}
