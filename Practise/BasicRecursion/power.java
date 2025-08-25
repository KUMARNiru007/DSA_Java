package BasicRecursion;

public class power {

    public static int powerOf(int num,int power){
        if(power==0) return 1;
        if(power==1) return num;
        return num * powerOf(num,power-1);
    }
    
    public static void main(String[] args) {
        System.out.println(powerOf(3,3));
    }
    
}
