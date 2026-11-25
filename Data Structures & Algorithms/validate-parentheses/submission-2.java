class Solution {
    public boolean isValid(String s) {
        Stack<Character> leftParan = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftParan.push(')');
            } 
            else if (c == '{') {
                leftParan.push('}');
            }
            else if (c == '[') {
                leftParan.push(']');
            }
            else {
                if (leftParan.isEmpty() || leftParan.pop() != c) {
                    return false;
                }
            }
            
        }

        return leftParan.isEmpty();
    }
}
