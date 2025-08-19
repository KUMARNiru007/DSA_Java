package numberSystem;
import java.util.Scanner;
public class even {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number");
        int number = sc.nextInt();

        if ((number & 1) == 0){
        System.out.println("even");}
        else {
        System.out.println("Odd");
        
        }
        
    }
    
}
