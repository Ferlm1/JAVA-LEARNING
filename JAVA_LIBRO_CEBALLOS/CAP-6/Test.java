import java.io.*;
// https://aka.ms/Full-Time
public class Test {
    public static void main(String[] args){
        // Definir un flujo de caracteres de entrada: flujoE
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader flujoE = new BufferedReader(isr);
        // Definir una referencia al flujo estándar de salida: flujoS
        PrintStream flujoS = System.out;

        char opcion;
        int ncars;
        String sdato;
        float precio = 0.0F;
        try{
            flujoS.print("Opcion (a, b o c): ");
            opcion = (char)flujoE.read();
            flujoE.readLine(); // limpiar los caracteres \r\n
            // o bien, se podría utilizar el código siguiente:
            // ncars = 2;           // caracteres disponibles
            // flujoE.skip(ncars); // saltar los caracteres CR LF
            flujoS.print("Precio: ");
            sdato = flujoE.readLine();
            precio = (sdato != null)
                     ? Float.parseFloat(sdato)
                     : Float.NaN;
        }
        catch (IOException ignorada){ }
        flujoS.println(precio);
        flujoS.println("Continua la aplicación");
    }
}

//Para solicitar una cita usted puede comunicarse al teléfono es 55 5340-0999 CCAMER para que le proporcionen su cita ya que solo se atenderá a quien tenga cita confirmada. Solo le pido amablemente sea paciente por el alto número de afluencia 
// de llamadas y es posible que se demore un poco.