public class LCP1456 {
    static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
    public static void main(String[] args){
        String s="sabareesh";
        int count =0;
        int k=3;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))) count++;
        }
        System.out.println(count);
        int max=count;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))) count++;
             if(isVowel(s.charAt(i-k))) count--;
             max=Math.max(count,max);
        }
        System.out.println(max);

    }
}
