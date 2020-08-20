public class MiOrdenador{
    public static void main(String[] args){
        COrdenador miOrdenador = new COrdenador();
        miOrdenador.EstablecerMarca("Alien");
        miOrdenador.EstablecerProcesador("intel core i5");
        miOrdenador.EstablecerPeso(5);
        miOrdenador.EncenderOrdenador();
        miOrdenador.DesactivarPantalla();
        miOrdenador.ActivarPantalla();
        miOrdenador.Estado();
        miOrdenador.ApagarOrdenador();
    }
}