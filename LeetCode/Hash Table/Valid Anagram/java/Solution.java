class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a= t.toCharArray();
        char[] b=s.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}