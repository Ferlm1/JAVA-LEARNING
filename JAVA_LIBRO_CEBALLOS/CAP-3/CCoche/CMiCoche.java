public class CMiCoche{
    public static void main(String args[]){
        CCoche bmw = new CCoche();
        bmw.EstablecerMarca("BMW");
        bmw.EstablecerModelo("2020");
        bmw.EstablecerColor("Rojo");
        bmw.Estado();
        bmw.ArrancarMotor();
        bmw.Acelerar();
        bmw.CambiarVelocidad(20);
        bmw.Frenar();
        bmw.PararMotor();
    } 
}