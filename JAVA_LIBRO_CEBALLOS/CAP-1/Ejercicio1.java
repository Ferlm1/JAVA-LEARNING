/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    
    public static double obtenerFormulaGeneral(int a, int b, int c){
        double resultado = 0;
        resultado = (Math.pow(b,2) - 4*a*c) / (2*a);
        return resultado;
    }
    
    public static float sacarMedia(int num1, int num2, int num3, int num4){
        float resultado = (num1 + num2 + num3 + num4) / 4F;
        return resultado;
    }
    
    public static int sumar(int num1, int num2, int num3, int num4){
        int resultado = 0;
        resultado = num1 + num2 + num3 + num4;
        return resultado;
    }

    public static void mostrarMensaje(){
        System.out.println("Bienvenido al mundo de Java");
        System.out.println("Podrás dar solución a muchos problemas");
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        mostrarMensaje();
        int suma = sumar(5,6,7,8);
        float media = sacarMedia(6,7,8,9);
        double resultado = obtenerFormulaGeneral(1, 5, 2);
        
        System.out.println("La suma es: " + suma);   
        System.out.println("La media es: " + media);
        System.out.println("La fórmula general es: " + resultado);
    }
}
