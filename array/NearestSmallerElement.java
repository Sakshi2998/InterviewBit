public class Solution {
    public ArrayList < Integer > prevSmaller(ArrayList < Integer > A) {
        if (A.size() == 0)
            return new ArrayList < > ();
        Stack < Integer > stack = new Stack < > ();
        stack.push(A.get(0));
        ArrayList < Integer > answer = new ArrayList < > ();
        answer.add(-1);

        for (int i = 1; i < A.size(); i++) {
            while (!stack.isEmpty() && stack.peek() >= A.get(i))
                stack.pop();
            answer.add(stack.isEmpty() ? -1 : stack.peek());
            stack.push(A.get(i));
        }
        return answer;
    }
}
