/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejerciciofactory;

import  ejercicio_factory2.IConexion2;

public class ConexionOracle implements IConexion2{
    
    private String host;
    private String puerto;
    private String usuario;  
    private String contraseña;
    public ConexionOracle(){
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "admin";
        this.contraseña = "123";   
    }
    
    public void conectar(){
        System.out.println("Se conecto a Oracle");
    }
     public void desconectar(){
        System.out.println("Se desconecto a Oracle");
     }
      public String ToString(){
        return "ConexionOracle {host=" + host + ", puerto= " + puerto +", usuario= " + usuario + ", contraseña= " + contraseña + "]";  
      }
}
