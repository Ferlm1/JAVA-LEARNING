class CRacional {
    private int Numerador;
    private int Denominador;

    public CRacional(int Num, int Den){
        Numerador = Num;
        if (Den == 0) Den = 1; // El denominador no puede ser cero
        Denominador = Den;
    }

    public static CRacional Sumar(CRacional a, CRacional b){
        int num = a.Numerador * b.Denominador + a.Denominador * b.Denominador;
        int deno = a.Denominador * b.Denominador;
        return new CRacional(num, deno); 
    }

    public void Restar(CRacional racional){
        int num1, num2, deno, nume;
        deno = obtenerDenominador() * racional.obtenerDenominador();
        num1 = (deno/obtenerDenominador()) * obtenerNumerador();
        num2 = (deno/racional.obtenerDenominador()) * racional.obtenerNumerador();
        nume = num1 - num2;
        System.out.println("La resta de " + obtenerNumerador() + "/" + obtenerDenominador() +
        " - " + racional.obtenerNumerador() + "/" + racional.obtenerDenominador());
        System.out.println(" es " + nume + "/" + deno);
        Numerador = nume;
        Denominador = deno;
    }

    public void Mutiplicar(CRacional racional){
        int nume, deno;
        nume = obtenerNumerador() * racional.obtenerNumerador();
        deno = obtenerDenominador() * racional.obtenerDenominador();
        System.out.println("La multiplicación de " + obtenerNumerador() + "/" + obtenerDenominador() +
        " * " + racional.obtenerNumerador() + "/" + racional.obtenerDenominador());
        System.out.println(" es " + nume + "/" + deno);
        Numerador = nume;
        Denominador = deno;
    }

    public int obtenerNumerador(){
        return Numerador;
    }

    public int obtenerDenominador(){
        return Denominador;
    }
    public void VisualizarRacional(){
        System.out.println(Numerador + "/" + Denominador);
    } 
}