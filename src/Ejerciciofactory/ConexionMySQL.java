/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejerciciofactory;

import ejercicio_factory2.IConexion2;
public class ConexionMySQL implements IConexion2{
    
    
    private String host;
    private String puerto;
    private String usuario;  
    private String contraseña;
    public ConexionMySQL (){
        
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "admin";
        this.contraseña = "123";   
    }
    
    public void conectar(){
        System.out.println("Se conecto a MYSQL");
    }
     public void desconectar(){
        System.out.println("Se desconecto a MYSQL");
     }
      public String ToString(){
        return "ConexionMYSQL {host=" + host + ", puerto= " + puerto +", usuario= " + usuario + ", contraseña= " + contraseña + "]";  
      }
}

