package algorithm.stacksandqueues;

public class Main {
  public static void main(String[] args){
    testArrayMultiStack();
  }

  private static void testArrayMultiStack(){
    ArrayMultiStack myStack = new ArrayMultiStack(3);
    myStack.push(0, 4);
    myStack.push(1, 5);
    myStack.printAll();
    int popanswer = myStack.pop(0);
    System.out.println("pop answer:" + popanswer);
    myStack.printAll();
  }
}
