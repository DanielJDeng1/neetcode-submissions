class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 < p2) {
            char leftChar = s.charAt(p1);
            char rightChar = s.charAt(p2);
            if (!Character.isLetterOrDigit(leftChar)) {
                p1++;
            }
            else if (!Character.isLetterOrDigit(rightChar)) {
                p2--;
            }
            else {
                if (leftChar != rightChar) {
                    return false;
                }
                p1++;
                p2--;
            }

        }

        return true;
    }
}
