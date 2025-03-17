package Ejerciciofactory;

import ejercicio_factory2.IConexion2;

public class ConexionSQLServer implements IConexion2 {
    
    private String host;
    private String puerto;
    private String usuario;  
    private String contraseña;
    
    public ConexionSQLServer(){
        this.host = "localhost";
        this.puerto = "1433"; // Puerto predeterminado de SQL Server
        this.usuario = "admin";
        this.contraseña = "123";
    }
    
    @Override
    public void conectar(){
        System.out.println("Se conectó a SQL Server");
    }

    @Override
    public void desconectar(){
        System.out.println("Se desconectó de SQL Server");
    }

    @Override
    public String toString(){
        return "ConexionSQLServer {host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contraseña=" + contraseña + "}";
    }
}
