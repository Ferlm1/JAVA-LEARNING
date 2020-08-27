class Racional{
    public static void main(String[] args){
        //Punto de entrada a la aplicación
        CRacional r1 = new CRacional(6, 5); // crear un objeto CRacional
        CRacional r2 = new CRacional(3, 5); 
        CRacional r = CRacional.Sumar(r1, r2); 
        r1.Restar(r2);
        r1.Mutiplicar(r2);
        r1.VisualizarRacional();
        r.VisualizarRacional();
    }
}