class COrdenador{
    String marca;
    String procesador;
    int peso;
    boolean encendido = false;
    boolean pantalla = false;

    public void EncenderOrdenador(){
        if(encendido == true){
            System.out.println("El ordenador ya está encendido");
        }
        else {
            encendido = true;
            pantalla = true;
            System.out.println("El ordenador ha sido encendido");
        }
    }

    public void ApagarOrdenador(){
        if(encendido == false){
            System.out.println("El ordenador ya está apagado");
        }
        else {
            System.out.println("El ordenador se apagará...Good bye!");
            encendido = false;
            pantalla = false; 
        }
    }

    public void DesactivarPantalla(){
        if(pantalla == false){
            System.out.println("La pantalla ya está desactivada");
        } else {
            pantalla = false;
            System.out.println("La pantalla ha sido desactivada");
        }
    }

    public void ActivarPantalla(){
        if(pantalla == true){
            System.out.println("La pantalla ya está activada");
        }else{
            pantalla = true;
            System.out.println("La pantalla ha sido activada");
        }
    }

    public void Estado(){
        System.out.print("\nEl estado del ordenador es el siguiente:");
        System.out.print("\nMarca: " + marca);
        System.out.print("\nProcesador: " + procesador);
        System.out.print("\nPeso: " + peso + "kg.");

        if (encendido == true){
            System.out.print("\nEl ordenador está encendido");
        }
        else
            System.out.print("\nEl ordenador está apagado");

        if (pantalla == true){
            System.out.print("\nLa pantalla está activada");
        }
        else
            System.out.print("\nLa pantalla está desactivada");

        System.out.print("\n");
    }

    public String ObtenerMarca(){
        return marca;
    }

    public void EstablecerMarca(String ma){
        marca = ma;
    }

    public String ObtenerProcesador(){
        return procesador;
    }

    public void EstablecerProcesador(String proce){
        procesador = proce;
    }

    public int ObtenerPeso(){
        return peso;
    }

    public void EstablecerPeso(int w){
        peso = w;
    }
}