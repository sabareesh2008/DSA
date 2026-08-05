import java.util.ArrayDeque;

public class binary{
    public static void main(String[] args){
          ArrayDeque<String> arr = new ArrayDeque<>();
        arr.offer("1");
        for(int i =0;i<10;i++){
            String current=arr.poll();
            System.out.println(current);
            arr.offer(current+"0");
            arr.offer(current+"1");
        }
       
    }
}