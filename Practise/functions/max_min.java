package functions;

import java.util.Scanner;
public class max_min {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
     System.out.println("Enter three numbers ");
     int a= sc.nextInt();
     int b= sc.nextInt();
     int c= sc.nextInt();
     int max=  max(a,b,c);
     int min= min(a,b,c);
     System.out.println("Maximum no :"+max +"\nMinimun no: "+min);
    }


    static int max(int a,int b, int c){
        int max=a;
        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;

        }
        return max;

    }

    static int min(int a,int b, int c){
        int min=a;
        if(min>b){
            min=b;
        }
        if(min>c){
            min=c;

        }
        return min;

    }
    
}
