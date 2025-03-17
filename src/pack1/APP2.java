package pack1;


import ejercicio_factory2.IConexion2;

public class APP2 {

    public static void main(String[] args) {
        // Crear una instancia de la fábrica
        ConexionFabrica fabrica = new ConexionFabrica();
        
        // Conexión a Oracle
        IConexion2 cx1 = fabrica.getConexin2("ORACLE");
        cx1.conectar();
        cx1.desconectar();

        // Conexión a MySQL
        IConexion2 cx2 = fabrica.getConexin2("MYSQL");
        cx2.conectar();
        cx2.desconectar();

        // Conexión a H2 (no soportado, debería devolver una conexión vacía)
        IConexion2 cx3 = fabrica.getConexin2("H2");
        cx3.conectar();
        cx3.desconectar();
    }
}

 

