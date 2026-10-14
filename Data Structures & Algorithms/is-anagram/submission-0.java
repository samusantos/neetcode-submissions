class Solution {
    public boolean isAnagram(String s, String t) {
        String[] s1 = s.split("");
        String[] s2 = t.split("");

        if(s1.length != s2.length) {
            return false;
        }

        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i = 0; i < s1.length; i++) {
            if(!s1[i].equals(s2[i])) {
                return false;
            }
        }

        return true;
    }
}
