public class LCP1920 {
    public static void main(String[] args) {
        int[] a={5,0,1,2,3,4};
        int[] b= new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[a[i]];
            System.out.println(b[i]+" ");
        }
    }
}
