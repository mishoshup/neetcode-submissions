class Solution {
    public boolean isValid(String s) {
        char[] sCharArr = s.toCharArray();
        Deque<Character> charactersStack = new ArrayDeque<>();

        for (char c : sCharArr) {
            switch (c) {
                case '(':
                charactersStack.push(c);
                break;
                case '{':
                charactersStack.push(c);
                break;
                case '[':
                charactersStack.push(c);
                break;
                case ')':
                        if (charactersStack.peek() == null) {
            return false;
        }
                if (charactersStack.peek() != '(') {
                    return false;
                }
                charactersStack.pop();
                break;
                case '}':
                        if (charactersStack.peek() == null) {
            return false;
        }
                if (charactersStack.peek() != '{') {
                    return false;
                }
                charactersStack.pop();
                break;
                case ']':
                        if (charactersStack.peek() == null) {
            return false;
        }
                if (charactersStack.peek() != '[') {
                    return false;
                }
                charactersStack.pop();
                break;
            }                
        }

        if (charactersStack.peek() != null) {
            return false;
        }
        return true;
    }
}
