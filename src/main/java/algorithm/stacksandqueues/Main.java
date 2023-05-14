package algorithm.stacksandqueues;

import java.rmi.NoSuchObjectException;

public class Main {
  public static void main(String[] args){
    testArrayMultiStack();
  }

  private static void testArrayMultiStack(){
    ArrayMultiStack myStack = new ArrayMultiStack(3);
    myStack.push(2, 1);
    myStack.push(2, 2);
    myStack.push(2, 3);
    myStack.push(1, 1);
    myStack.push(1, 2);
    myStack.push(0, 1);
    myStack.printAll();
    try {
      myStack.pop(2);
      int peek = myStack.peek(2);
      System.out.println("Peeked Value: " + peek);
    } catch (NoSuchObjectException ignored) {}

    myStack.printAll();
  }
}
