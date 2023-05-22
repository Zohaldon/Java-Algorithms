// Implementation of queue using stack
package algorithm.stacksandqueues;

import java.util.Stack;

public class QueueWithStack<T> {
  private final Stack<T> inStack;
  private final Stack<T> outStack;

  public QueueWithStack(){
    inStack = new Stack<>();
    outStack = new Stack<>();
  }

   public void push(T data){
     inStack.push(data);
   }

   public T pop(){
     shiftStack();
     return outStack.pop();
   }

   public int size(){
     return inStack.size() + outStack.size();
   }

   public T peek(){
     shiftStack();
     return outStack.peek();
   }

   private void shiftStack(){
     if(inStack.isEmpty()){
       return;
     }

     if(outStack.isEmpty()){
       while(!inStack.isEmpty()){
         outStack.push(inStack.pop());
       }
     }
   }
}
