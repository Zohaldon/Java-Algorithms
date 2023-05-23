// Stack sort algorithm implementation that keeps smallest integer on top.
package algorithm.stacksandqueues;

import java.util.Stack;

// Runtime :- O(N^2)
public class SortedStack {

  public static Stack<Integer> sortStack(Stack<Integer> stack){
    if(stack.isEmpty() || stack.size() < 2)
      return stack;

    Stack<Integer> resultStack = new Stack<>();

    while(!stack.isEmpty()){
      if(resultStack.isEmpty()){
        resultStack.push(stack.pop());
        continue;
      }

      int temp = stack.pop();
      if(temp > resultStack.peek()){
        while(!resultStack.isEmpty()){
          stack.push(resultStack.pop());
        }
        resultStack.push(temp);
      } else {
        resultStack.push(temp);
      }
    }

    return resultStack;
  }
}
