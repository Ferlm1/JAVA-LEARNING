import java.lang.System; // importar la clasee System

public class CApGrados {
    // Definición de constantes
    final static int limInferior = -30;
    final static int limSuperior = 100;
    final static int incremento = 6;
    
    public static void main(String[] args){
        // Declaración de variables
        CGrados grados = new CGrados();
        int gradosCent = limInferior;
        float gradosFahr = 0;

        while (gradosCent <= limSuperior) // mientras ... hacer:
        {
            // Asignar al objeto grados el valor en grados centígrados
            grados.CentígradosAsignar(gradosCent);
            // Obtener del objeto grados los grados fahrenheit
            gradosFahr = grados.FahrenheitObtener();
            // Escribir la siguiente línea de la tabla
            System.out.println(gradosCent + " C" + "\t" + gradosFahr + " F");
            // Siguiente valor
            gradosCent += incremento;
        }
    }
}
