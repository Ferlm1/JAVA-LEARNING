class CPolinomio {
    // El término de mayor grado tiene exponente 3 fijo
    double c3, c2, c1, c0; //coeficientes
    
    public void Polinomio(double a, double b, double c, double d){
        c3 = a; c2 = b; c1 = c; c0 = d;
    }

    public double ValorPara(double x){
        double resultado;
        resultado = c3*x*x*x + c2*x*x + c1*x + c0;
        return resultado; // devolver el valor calculado
    }
}

public class CMiAplicacion{
    public static void main(String[] args){
        CPolinomio pol1 = new CPolinomio();
        pol1.Polinomio(5, -1.7, 2, 3);

        double r = pol1.ValorPara(10.5);
        System.out.println(r);

        r = pol1.ValorPara(1.5);
        System.out.println(r);
    }
}