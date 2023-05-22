package algorithm.stacksandqueues;

public class StackOfStacks {
  public AStack top;
  private int count = 0;

  public StackOfStacks(){
    top = null;
    count = 0;
  }

  public void push(AStack stack){
    if(count == 0){
      top = stack;
    } else {
      stack.next = top;
      top = stack;
    }
    count++;
  }

  public void pop(){
    if(count == 1) {
      top = null;
      count = 0;
    } else if(count > 1) {
      top = top.next;
      count--;
    }
  }

  public AStack peek(){
    if(count == 0)
      return null;

    return top;
  }

  public int count(){
    return count;
  }

  public AStack getStackAtIndex(int index){
    if(index < 0 || index >= count)
      return null;

    AStack currentStack = top;
    for(int i = 0; i < index; i++){
      currentStack = currentStack.next;
    }

    return currentStack;
  }
}
