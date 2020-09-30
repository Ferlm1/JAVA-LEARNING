import java.util.*;

public class CDiasMes {
    // Días correspondientes a un mes de un año dado
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
        int dias = 0, mes = 0, anio = 0;
        System.out.print("Mes (##): "); mes = Leer.nextInt();
        System.out.print("anio (####): "); anio = Leer.nextInt();

        switch (mes)
        {
            case 1:     // enero
            case 3:     // marzo
            case 5:     // mayo
            case 7:     // julio
            case 8:     // agosto
            case 10:    // octubre
            case 12:    // diciembre
                dias = 31;
                break;
            case 4:     // abril
            case 6:     // junio
            case 9:     // septiembre
            case 11:    // noviembre
                dias = 30;
                break;
            case 2:     // febrero
                // ¿Es el anio bisiesto?
                if ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0))
                    dias = 29;
                else 
                    dias = 28;
                    break;
            default:
                System.out.println("\nEl mes no es válido");
                break;
        }
        if (mes >= 1 && mes <= 12)
            System.out.println("\nEl mes " + mes + " del anio " + anio + " tiene " + dias + " dias");
    }
}
