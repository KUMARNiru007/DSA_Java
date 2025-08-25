package BasicMathematics;

public class factorial {

    public static int factor(int n){

        // int result = 1;
        // for( int i =1;i<=n;i++){
        //     result=result*i;
        // }
        // return result;

        if(n<=1) return 1; //base condition
        return n*factor(n-1);

    }

    public static void main(String args[]){
        System.out.println(factor(15));
    }
    
}
