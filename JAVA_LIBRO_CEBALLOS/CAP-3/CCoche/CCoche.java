public class CCoche {
    private String Marca, Modelo, Color;
    private boolean arrancado;
    int velocidad;
 
    public void ArrancarMotor(){
        if (arrancado == true){
            System.out.println("El coche ya ha arrancado");
            return;
        }
        arrancado = true;
        velocidad = 0;
    }

    public void CambiarVelocidad(int vel){
        if (vel > 0){
            velocidad = vel;
            System.out.println("El coche tiene una velocidad de " + velocidad);
        }
        else 
            System.out.println("No existen las velocidades negativas");
    }

    public void Acelerar(){
        if (velocidad == 0){
            if (arrancado){
                System.out.println("El coche está acelerando a una velocidad de " + velocidad);
            }else{
                System.out.println("Enciende primero el motor");
            }
        }else{
            System.out.println("El coche ya ha acelerado");
        } 
    }

    public void Frenar(){
        if (arrancado == true){
            if (velocidad == 0){
                System.out.println("El coche ya ha frenado");
                return;
            }
            System.out.println("Frenando el coche");
            velocidad = 0;
            return;
        }
        System.out.println("El coche no ha arrancado");
    }
    
    public void PararMotor(){
        if(arrancado) {
            System.out.println("El coche ha apagado el motor");
            arrancado = false;
        }         
        else
            System.out.println("El coche ya tiene el motor apagado");
    }

    public void EstablecerModelo(String modelo){
        Modelo = modelo;
    }

    public String ObtenerModelo(){
        return Modelo;
    }

    public void EstablecerMarca(String marca){
        Marca = marca;
    }

    public String ObtenerMarca(){
        return Marca;
    }

    public void EstablecerColor(String colour){
        Color = colour;
    }

    public String ObtenerColor(){
        return Color;
    }

    public void Estado(){
        System.out.println("Marca:" + Marca);
        System.out.println("Modelo:" + Modelo);
        System.out.println("Color:" + Color);  
    }

}