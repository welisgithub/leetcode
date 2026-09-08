class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        char last = 'a';
        while(l < r){
            last = s[r];
            s[r] = s[l];
            s[l] = last;
            l++;
            r--;
        }
    }
}