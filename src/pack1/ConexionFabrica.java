/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack1;

import ejercicio_factory2.IConexion2;
import Ejerciciofactory.ConexionMySQL;
import Ejerciciofactory.ConexionMySQL;
import Ejerciciofactory.ConexionOracle;
import Ejerciciofactory.ConexionOracle;
import Ejerciciofactory.ConexionPostgreSQL;
import Ejerciciofactory.ConexionPostgreSQL;
import Ejerciciofactory.ConexionVacia;
import Ejerciciofactory.ConexionSQLServer;
import Ejerciciofactory.ConexionSQLServer;
import Ejerciciofactory.ConexionVacia;

public class ConexionFabrica {
    
    public IConexion2 getConexin2(String motor){
        if(motor == null){
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("MYSQL")){
             return new  ConexionMySQL();
        }
        else if (motor.equalsIgnoreCase("ORACLE")){
             return new  ConexionOracle();
        }
        else if (motor.equalsIgnoreCase("POSTGRE")){
             return new  ConexionPostgreSQL();
        }
        else if (motor.equalsIgnoreCase("SQL")){
             return new  ConexionSQLServer();
        }
       
     return new ConexionVacia();
    
}
}
