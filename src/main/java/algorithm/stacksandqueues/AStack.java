package algorithm.stacksandqueues;

public class AStack {
  private DataNode<Integer> top = null;
  private int size = 0;

  public void push(DataNode<Integer> newNode) {
    if (size == 0) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
    size++;
  }

  public DataNode<Integer> pop() {
    if (size == 0)
      return null;
    DataNode<Integer> returnNode = top;
    top = returnNode.next;
    size--;
    return returnNode;
  }

  public DataNode<Integer> peek(){
    if(size == 0){
      return null;
    }

    return top;
  }
}
