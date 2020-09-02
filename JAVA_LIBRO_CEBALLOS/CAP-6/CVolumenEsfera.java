// Esta clase obtiene el volúmen de una esfera dado su radio
class CVolumenEsfera {
    
    public static double obtenerVolumen(){
        double v, r;
        System.out.print("Ingresa el radio de la esfera: "); 
        r = Leer.datoFloat();
        v = (4F/3) * Math.PI*Math.pow(r,3);
        return v;   
    }

    public static void main (String[] args){
        System.out.println("El volúmen de la esfera es: " + obtenerVolumen());
    }
}
