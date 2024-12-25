import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class ConstructStringWithRepeatLimit {
    public String repeatLimitedString(String s, int repeatLimit) {
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Character>queue = new PriorityQueue<>(Comparator.reverseOrder());
        Stack<Character>stack = new Stack<>();
        for (char a:s.toCharArray()){
            queue.offer(a);
        }
        int count = 0;
        char character;
        char temp = queue.peek();
        while(queue.size()!=0){
            character = queue.poll();
            if(count<repeatLimit && temp == character){
                sb.append(character);
                count++;
                while (stack.size()!=0)queue.offer(stack.pop());
            } else if (count >= repeatLimit) {
                count = 0;
                stack.push(character);
                while(queue.size() >0 && character == queue.peek()) stack.push(queue.poll());
                if(queue.size() >0)temp = queue.peek();
            } else {
                count = 1;
                sb.append(character);
                if(queue.size() >0)temp = queue.peek();
            }
        }
        while(stack.size()>0 && count<repeatLimit-1) {
            sb.append(stack.pop());
            count++;
        }
        String result = sb.toString();
        return result;
    }
}
