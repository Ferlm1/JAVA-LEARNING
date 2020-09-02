import java.io.*;

public class Test3 {
    public static void main(String[] args){
        PrintStream flujoS = System.out;

        char car1 = 'A', car2 = 65, car3 = 0;
        car3 = (char)(car1 + 'a' - 'A');
        flujoS.println(car3 + " " + (int)car3); 
        car3 = (char)(car2 + 32); 
        flujoS.println(car2 + " " + (int)car2);
    }    
}
