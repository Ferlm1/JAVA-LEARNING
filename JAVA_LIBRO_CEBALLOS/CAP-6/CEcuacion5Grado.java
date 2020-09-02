import java.util.*;

class CEcuacion5Grado {
    public static double resolverPolynomial(double x){
        return 3*Math.pow(x,5) - 5*Math.pow(x,3) + 2*x - 7; 
    }

    public static double resolverPolynomial(double a, double b, double c){
        return 3*Math.pow(a,5) - 5*Math.pow(b,3) + 2*c - 7;
    }
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
        // double x;
        double a,b,c;
        System.out.print("Valor de a: "); a = Leer.nextDouble();
        System.out.print("Valor de b: "); b = Leer.nextDouble();
        System.out.print("Valor de c: "); c = Leer.nextDouble();
        System.out.printf("Para a = %1.2f, \n\t, b = %2.2f \n\t, c = %3.2f \n\t, 3a^5 - 5b^3 + 2c - 7 = %4.2f", a, b, c, resolverPolynomial(a,b,c));
        // System.out.printf("Para x = %1.2f, 3x^5 - 5x^3 + 2x - 7 = %2.2f", x, resolverPolynomial(x));
    }   
}
