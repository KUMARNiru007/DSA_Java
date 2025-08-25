package BasicMathematics;
import java.util.ArrayList;
public class countPrime {
 public static ArrayList<Integer> Prime(int n){
   ArrayList<Integer> primes = new ArrayList<>();
    for(int i = 2;i<n;i++){
        boolean isPrime= true;
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                isPrime= false;
                break;
            }

           
        }  
        if(isPrime) primes.add(i);  
    }
     
     return primes;
        
     

}

     public static void main(String args[]){
    System.out.println(Prime(10));

    
}
}
