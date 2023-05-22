package algorithm.stacksandqueues;

import java.rmi.NoSuchObjectException;

public class Main {
  public static void main(String[] args){
    testArrayMultiStack();
    testStackMin();
    testSetOfStacks();
  }

  private static void testArrayMultiStack(){
    System.out.println("\n\n==================Test MultiStack Array ==================");
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
    System.out.println("========================================================");
  }

  private static void testStackMin(){
    System.out.println("\n\n==================Test Min Stack ==================");
    StackMin stack = new StackMin();
    stack.push(10);
    stack.push(4);
    stack.push(11);
    stack.push(3);
    stack.push(1);
    stack.printAll();
    System.out.println();

    stack.pop();
    stack.printAll();
    System.out.println("Min Node: " + stack.min().data);

    stack.pop();
    stack.printAll();
    System.out.println("Min Node: " + stack.min().data);


    stack.pop();
    stack.printAll();
    System.out.println("Min Node: " + stack.min().data);
    System.out.println("========================================================");
  }

  private static void testSetOfStacks(){
    System.out.println("\n\n================== Test Set of Stack ==================");
    SetOfStacks testStack = new SetOfStacks(3);
    testStack.push(10);
    testStack.push(2);
    testStack.push(30);
    testStack.push(49);
    testStack.push(55);
    testStack.push(63);
    testStack.push(72);
    testStack.push(82);
    testStack.printAll();
    System.out.println("-----------------------------------------");
    testStack.pop();
    testStack.pop();
    testStack.printAll();
    System.out.println("========================================================");
  }
}
