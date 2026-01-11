public class P002_ValidAnagram{
    public static boolean isAnagram(String s, String t){
        int[] freq = new int[26];
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++ ){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int count: freq){
            if(count != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
        System.out.println(isAnagram(s1, s2));

    }
}