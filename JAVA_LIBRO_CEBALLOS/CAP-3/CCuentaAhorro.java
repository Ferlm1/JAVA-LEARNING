/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class CCuentaAhorro extends CCuenta{
    // Atributos
    private double cuotaMantenimiento;

    //Métodos
    public CCuentaAhorro() {} // constructor sin parámetros
    public CCuentaAhorro(String  nom, String cue, double sal, double tipo, double mant){
        super(nom, cue, sal, tipo); // invoca al constructor CCuenta
        asignarCuotaManten(mant);
    }

    public void asignarCuotaManten(double cantidad){
        if (cantidad < 0){
            System.out.println("Error: cantidad negativa");
            return;
        }
        cuotaMantenimiento = cantidad;
    }

    public double obtenerCuotaManten(){
        return cuotaMantenimiento;
    }

    public void reintegro(double cantidad){
        double saldo = estado();
        double tipoDeInteres = obtenerTipoDeInteres();
        if (tipoDeInteres >= 3.5){
            if (saldo - cantidad < 1500){
                System.out.println("Error: no dispone de esa cantidad");
                return;
            }
        }
        super.reintegro(cantidad); // método reintegro de la clase base (superclase)
    }

}
