public class exception{
    public static void main(String[] args) {
        try{
           
            int[] arr={10,203,0};
            System.out.println(arr[5]);
            
        }
        catch(ArithmeticException e){
            System.out.println("Error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }
}