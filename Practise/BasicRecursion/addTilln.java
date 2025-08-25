package BasicRecursion;

public class addTilln {

    public static String addNumber(int n){
        
        if(n<=1){
            return "1" ;}
          return n+addNumber(n-1);
    }

    public static void main(String[] args) {
        System.out.println(addNumber(5));
    }
    
}
