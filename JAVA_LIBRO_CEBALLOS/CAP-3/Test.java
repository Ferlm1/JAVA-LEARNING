/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        CCuentaAhorro cuenta01 = new CCuentaAhorro();
        CCuenta cuenta02 = new CCuenta("Teresa Garibaldi Gast�lum", "BBVA", 60000, 3.5);
        CCuentaAhorro cuenta03 = new CCuentaAhorro("Bruce Wayne", "Banamex", 6000, 3.5, 0.80);
        
        // Cobrar cuota de mantenimiento
        cuenta03.reintegro(cuenta03.obtenerCuotaManten());
        
        // Ingreso
        cuenta03.ingreso(6000);

        //Reintegro
        cuenta03.reintegro(10000);

        cuenta01.asignarNombre("Fernando Lazcano Mej�a");
        cuenta01.asignarCuenta("Una cuenta");
        cuenta01.asignarTipoDeInteres(2.5);
        
        cuenta01.ingreso(12000);
        cuenta01.reintegro(3000);
        
        System.out.println(cuenta01.obtenerNombre());
        System.out.println(cuenta01.obtenerCuenta());
        System.out.println(cuenta01.estado());
        System.out.println(cuenta01.obtenerTipoDeInteres());
        System.out.println();
        System.out.println(cuenta02.obtenerNombre());
        System.out.println(cuenta02.obtenerCuenta());
        System.out.println(cuenta02.estado());
        System.out.println(cuenta02.obtenerTipoDeInteres());
        System.out.println();
        System.out.println(cuenta03.obtenerNombre());
        System.out.println(cuenta03.obtenerCuenta());
        System.out.println(cuenta03.estado());
        System.out.println(cuenta03.obtenerTipoDeInteres());
    }
}
