public class LCP14{
    public static void main(String[] args) {
    String[] strs= new String[]{"flower","flow","flight","fling"};
    String prefix=strs[0];
    String res="";
        for(int i =0;i<strs.length;i++){
        char ch=prefix.charAt(i);
          for(int j=i+1;j<strs.length;j++){
            if(strs[j].charAt(j)!=ch)
              res=prefix.substring(0,i);
          }
        }
    System.out.println(res);
    }
}