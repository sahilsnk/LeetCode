import java.util.Stack;

public class CheckifaParenthesesStringCanBeValid {
    public boolean canBeValid(String S, String Locked) {
        if (S.length() % 2 == 1) return false;

        Stack<Integer> stack = new Stack<>();
        char[] s = S.toCharArray();
        char[] locked = Locked.toCharArray();

        for (int i = 0; i < s.length; i++) {
            if (s[i] == '(') {
                stack.push(i);
            } else if (s[i] == ')') {
                if (!stack.isEmpty() && s[stack.peek()] == '(' && locked[stack.peek()] == '1') {
                    stack.pop();
                } else if (locked[i] == '0') {
                    stack.push(i);
                } else {
                    return false;
                }
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            if (locked[top] == '1') {
                return false;
            }
        }

        return true;
    }
}
