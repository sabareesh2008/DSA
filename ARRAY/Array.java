
public class Array {
    int[] arr;
    int size;
    int capacity;
    Array(int capacity){
         arr = new int[capacity];
         this.capacity = capacity;
         size = 0;
    }
    boolean insert(int index, int element){
        if(index<0 || size>=capacity || index>size){
            System.out.println("cant to insert : Invalid index");
            return false;
        }
        for(int i=size;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=element;
        size ++;
        return true;
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    int get(int index){
        if(index<0 || index>=size){
            System.out.println("cant to get : Invaid");
            return -99999;
        }
        return arr[index];
    }
    void set(int index, int element){
         if(index<0 || index>=size){
            System.out.println("cant to set : Invaid");
        }
        arr[index]=element;
    }

    int search(int element){
        for( int i =0;i<size;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
    boolean delete(int index){
         if(index<0 || index>=size){
            System.out.println("cant to delet : Invaid");
            return false;
        }
        for (int i =index;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
        return true;
    }

    public static void main(String[] args) {
        Array arr1=new Array(5);
        arr1.insert(0,5);
        arr1.insert(1,4);
        arr1.insert(2,7);
        arr1.insert(3,10);
        arr1.insert(4,25);

        System.err.println("Array : ");
        arr1.display();
        System.out.println("\nGet : "+arr1.get(2));
        arr1.set(1,9);
        System.err.println("After set operation : ");
        arr1.display();
        System.out.println("\nDelete : ");
        arr1.delete(3);
        arr1.display();

    }
}
