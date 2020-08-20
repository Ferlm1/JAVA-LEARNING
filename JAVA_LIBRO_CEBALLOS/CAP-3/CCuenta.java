/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;
    
    public double estado(){
        return saldo;
    }
    
    public void asignarNombre(String nom){
        if(nom.length() == 0){
            System.out.println("Error: cadena vacía");
            return;
        }
        nombre = nom;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void asignarCuenta(String cue){
        if (cue.length() == 0){
            System.out.println("Error: cuenta no válida");
            return;
        }
        cuenta = cue;
    }
    
    public String obtenerCuenta(){
        return cuenta;
    }
    
    public void ingreso(double cantidad){
        if (cantidad < 0){
            System.out.println("Error: cantidad negativa");
            return;
        }
        saldo = saldo + cantidad;
    }
    
    public void reintegro(double cantidad){
        if (saldo - cantidad < 0){
            System.out.println("Error: no dispone de saldo");
            return;
        }
        saldo = saldo - cantidad;
    }
    
    public void asignarTipoDeInteres(double tipo){
        if(tipo < 0){
            System.out.println("Error: tipo no válido");
            return;
        }
        tipoDeInteres = tipo;
    }
    
    public double obtenerTipoDeInteres(){
        return tipoDeInteres;
    }

    //Constructor 
    
    public CCuenta(){
        System.out.println("Objeto CCuenta ha sido creado con exito, cainal");
    }
    
    public CCuenta (String nom, String cue, double sal, double tipo){
        asignarNombre(nom);
        asignarCuenta(cue);
        ingreso(sal);
        asignarTipoDeInteres(tipo);
    }
}
