public class sub {
    public static void main(String[] args) {
        int[][] arr={{90,89,100},{67,87,45},{98,99,89},{100,100,100}};
        double max=0;
        double sum=0;
        int c=0;
        double cgpa;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=0;j<arr[0].length;j++){
            sum+=arr[i][j];
            }
            cgpa = (sum/300.0) *10;
            if(max<cgpa) max=cgpa;
            if(cgpa<6) c++;
        }
        System.out.println("Topper mark : "+max);
        System.out.println("no.of Failed studetns : "+c);
    }
}
