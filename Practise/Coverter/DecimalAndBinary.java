package Coverter;

class Converter {
    public int toDecimal(int binary){
        int result=0;
        int index = 0;
        while(binary!=0){
            int lastBit = binary%10;
            if(lastBit==1){
            result = result +(int) Math.pow(2,index);
            }
            index++;
            binary = binary/10;
        }
       return  result ;
    }
    public String toBinary(int decimal){
        String result = "";
        while(decimal!=0){
            int lastBit = decimal&1;
            // result = result+lastBit; //wrong
            result = lastBit + result;
            decimal = decimal>>1;
        }
        return result;
    }

}


public class DecimalAndBinary {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int x= sc.nextInt();
        Converter convert = new Converter();
        // System.out.println(convert.toBinary(x));

        System.out.println(convert.toDecimal(1010));


    }
    
}
