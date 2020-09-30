import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class CMenor
{
    // Menor de tres números a, b y c
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
        float a, b, c, menor;
        // Leer los valores de a,b y c
        System.out.print("a : "); a = Leer.nextFloat();
        System.out.print("b : "); b = Leer.nextFloat();
        System.out.print("c : "); c = Leer.nextFloat();
        // Obtener el menor
        if (a < b)
            if (a < c)
                menor = a;
            else
                menor = c;
        else 
            if (b < c)
                menor = b;
            else
                menor = c;
        System.out.println("Menor = " + menor);
    }
}