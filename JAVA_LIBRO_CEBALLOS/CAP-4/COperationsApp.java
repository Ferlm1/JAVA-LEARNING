public class COperationsApp{

    public static void Chicharronera(double a, double b, double c){
        double resultado = 0;

        resultado = (b*b  - 4*a*c) / (2*a);
        System.out.println("El resultado de la chicharronera es: " + resultado);
    }
    public static void main(String[] args){
        int  a = 10, b = 3, d, e;
        boolean c = true;
        float x, y;
        x = a / b;
        c = a < b && c; //  c debe ser boolean. 
        d = a + b++;
        e = ++a - b;
        y = (float)a / b;

        Chicharronera(1, 5, 2);
    }
}