package MyArrays;

public class Myarray {

    private int[] items;
    private int currentIndex;


    public Myarray(int initialSize) {
        this.items= new int[initialSize];
    }

    public void insert(int value) {
        this.items[currentIndex] = value;
        currentIndex++;
    }
    public String toString(){
        // return "hey"; --> will run
        // String str = new String();
        // for(int num: this.items){
        //     str = str + (num+ ",");
        // }
        // return str;

        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int num: this.items){
            str.append(num+", ");
        }
        str.append("\b").append("\b").append("]");
        return str.toString();

    }

    
}
