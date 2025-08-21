class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            switch (op) {
                case "C":
                    // Remove the previous score
                    stack.pop();
                    break;
                case "D":
                    // Double the previous score
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    // Sum of the last two scores
                    int top = stack.pop();
                    int newTop = top + stack.peek();
                    stack.push(top);
                    stack.push(newTop);
                    break;
                default:
                    // It's a number
                    stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }
}
