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
        Converter convert = new Converter();

        long startTime = System.nanoTime();  // start time in nanoseconds

        int result = convert.toDecimal(1010);

        long endTime = System.nanoTime();    // end time in nanoseconds

        System.out.println("Decimal: " + result);
        System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");
    }
}

