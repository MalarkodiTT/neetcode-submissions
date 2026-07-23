class Solution {
    public int lengthOfLastWord(String s) {
        String sp[] = s.split(" ");
        int len = sp[sp.length-1].length();
        return len;
    }
}