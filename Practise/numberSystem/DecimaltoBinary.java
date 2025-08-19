package numberSystem;
import java.util.Scanner;
public class DecimaltoBinary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String result ="";
        System.out.println("Enter a number");

        int number = sc.nextInt();
        while(number  > 0){
            int rem = number%2;
            number = number/2;
            result = rem + result;

        }
        System.out.println(result);
    }
}
