package MyArrays;

public class Main {

    public static void main(String[] args) {
        
        //Primitive 
        //Arrays are in static in nature - length cannot inc dynamically.
        // int [] arr = new int[2] ;
        // arr[0]=1;
        // arr[1]=2;
        // System.out.println(arr );


        Myarray arr = new Myarray(15);

        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(10);

        

        // System.out.println(arr);
        //when ever sout --> call--> toString --> if not ---> sout memory
        // System.out.println(arr.indexOf(0));

        arr.removeAt(3);
        System.out.println(arr);;
    }
    
}
