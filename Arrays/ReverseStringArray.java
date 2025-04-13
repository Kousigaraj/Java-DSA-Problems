class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        int mid = s.length / 2;
        while(i < mid){
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
            j--;
        }
    }
}