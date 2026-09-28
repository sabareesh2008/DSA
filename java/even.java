public class even {
    public static void main(String[] args) {
        String name="sabareesh";
        int len=name.length();
        boolean even=false;
        if(len%2==0) even = true;
        for(int i=0;i<name.length();i++){
            if(even && i%2==0) System.out.println(name.charAt(i));
            else {
                if(i%2!=0){
                    System.out.println(name.charAt(i));
                }
            }
        }
    }
}
