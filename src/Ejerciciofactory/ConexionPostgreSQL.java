/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejerciciofactory;

import ejercicio_factory2.IConexion2;
   
    public class ConexionPostgreSQL implements IConexion2{
    
    private String host;
    private String puerto;
    private String usuario;  
    private String contraseña;
    public ConexionPostgreSQL(){
        this.host = "localhost";
        this.puerto = "142";
        this.usuario = "admin";
        this.contraseña = "1212";   
    }
    
    public void conectar(){
        System.out.println("Se conecto a POSTGREE");
    }
     public void desconectar(){
        System.out.println("Se desconecto a POSTGREE");
     }
      public String ToString(){
        return "ConexionPostgreSQL {host=" + host + ", puerto= " + puerto +", usuario= " + usuario + ", contraseña= " + contraseña + "]";  
      }
}


