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




    public int indexOf(int value){
        //linear search
        for(int i=0;i< this.currentIndex;i++){
            if(this.items[i] == value)  return i;

        }
        return -1;
    }

    public void removeAt(int index) {
        if(index > this.currentIndex) throw new IllegalArgumentException();
        for(int i = index ;i < this.currentIndex-1; i++){
            this.items[i]=this.items[i+1];
        }
            currentIndex--;
            this.items[currentIndex]=0;
        
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
        for(int i =0;i<this.currentIndex;i++){
            str.append(this.items[i]).append(", ");
        }
        str.append("\b").append("\b").append("]");
        return str.toString();

    }



    
}
