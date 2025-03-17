package Ejerciciofactory;

import ejercicio_factory2.IConexion2;

public class ConexionVacia implements IConexion2 {

    @Override
    public void conectar(){
        System.out.println("Conexión vacía: No se puede conectar.");
    }

    @Override
    public void desconectar(){
        System.out.println("Conexión vacía: No se puede desconectar.");
    }

    @Override
    public String toString(){
        return "ConexionVacia: No se estableció conexión.";
    }
}
