class sum{
    public static void main(String[] args) {
        int a=12345;
        int pos1=a%10;
        a=a/10;
        int pos2=a%10;
        a=a/10;
        int pos3=a%10;
        a=a/10;
        int pos4=a%10;
        a=a/10;
        int pos5=a%10;
        int even=pos2+pos4;
        int odd=pos1+pos3+pos5;
        System.out.println(even);
        System.out.println(odd);
    }
}