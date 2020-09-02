import java.lang.*;
import java.time.LocalDate;

public class CNameBirthday {

    public static void askInformation(){
        String name;
        int age, futureAge;
        LocalDate date = LocalDate.now();

        System.out.println("How is your name? ");
        name = Leer.dato();
        System.out.println("How old are you? ");
        age = Leer.datoInt();
        
        int years = 2030 - date.getYear();
        futureAge = age + years;

        System.out.printf("Hi %1s , in the year 2030 you will be %2d age", name, futureAge);
    }
    public static void main(String[] args){
        askInformation();
    }
}
