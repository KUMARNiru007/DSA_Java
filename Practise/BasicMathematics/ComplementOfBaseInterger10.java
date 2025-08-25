package BasicMathematics;

public class ComplementOfBaseInterger10 {
    public static class Solution {
        public int bitwiseComplement(int n) {
            // if (n == 0) return 1; 

           
            // String binary = "";
            // while (n != 0) {
            //     int lastBit = n & 1;      
            //     binary = lastBit + binary; 
            //     n = n >> 1;                
            // }

          
            // String complement = "";
            // for (int i = 0; i < binary.length(); i++) {
            //     if (binary.charAt(i) == '0') {
            //         complement += "1";
            //     } else {
            //         complement += "0";
            //     }
            // }

           
            // int result = 0;
            // int index = 0;
            // for (int i = complement.length() - 1; i >= 0; i--) {
            //     int bit = complement.charAt(i) - '0';  
            //     if (bit == 1) {
            //         result += (int)Math.pow(2, index);
            //     }
            //     index++;
            // }

            // return result;

            //--------------------------------------------------------------------------
            // if (n == 0) return 1;

            // int mask = 0;
            // int num = n;   

            // while (num != 0) {
            //     mask = (mask << 1) | 1; // build mask of all 1s
            //     num = num >> 1;         
            // }

            // return (~n) & mask; 

            
        if (n == 0) return 1;

            int mask = 0;
            int num = n;   

               
                mask = (1 << Integer.toBinaryString(n).length());
                mask=mask - 1;
            

            return (n) ^ mask; 
    


        
        
        
        }
    }

    // For testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.bitwiseComplement(5));  // Expected: 2
        System.out.println(sol.bitwiseComplement(7));  // Expected: 0
        System.out.println(sol.bitwiseComplement(10)); // Expected: 5
    }
}
