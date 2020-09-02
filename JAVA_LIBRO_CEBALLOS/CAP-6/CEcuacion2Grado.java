import java.util.*;

// Esta clase utiliza Scanner para la entrada de datos
public class CEcuacion2Grado {
    // Calcular las raíces de una ecuación de 2° grado
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
        double a, b, c; // coeficientes de la ecuación
        double d;
        double re, im; // parte real e imaginaria de la raíz

        System.out.println("Coeficientes a, b y c de la ecuación:");
        System.out.println("a == "); a = Leer.nextDouble();
        System.out.println("b == "); b = Leer.nextDouble();
        System.out.println("c == "); c = Leer.nextDouble();
        System.out.println();

        if (a == 0 && b == 0)
            System.out.println("La ecuación es degenerada");
        else if (a == 0)
            System.out.println("La única raíz es: " + -c/b);
        else {
            re = -b / (2 * a);
            d = b * b - 4 * a * c;
            im = Math.sqrt(Math.abs(d)) / (2 * a);
            if (d >= 0){
                System.out.println("Raíces reales");
                System.out.println((re + im) + ", " + (re - im));
            }
            else {
                System.out.println("Raíces complejas");
                System.out.println(re + " + " + Math.abs(im) + " j");
                System.out.println(re + " - " + Math.abs(im) + " j");
            } 
        }
    }
}
