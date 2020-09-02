import java.io.*;

public class Test2 {
    public static void main(String[] args){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader flujoE = new BufferedReader(isr);

        PrintStream flujoS = System.out;
        char car = 0;

        try{
            flujoS.print("Carácter: ");
            car = (char)flujoE.read();
            flujoS.print(car);
            flujoE.readLine();
            flujoS.print("Carácter: ");
            car = (char)flujoE.read();
            flujoS.println(car);
        }
        catch(IOException ignorada){}
    }    
}
