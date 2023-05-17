package algorithm.stacksandqueues;

public class AStack {
  private DataNode<Integer> topNode = null;
  private int size = 0;

  public void push(int data) {
    DataNode<Integer> newNode = new DataNode<>(data);
    if (size == 0) {
      topNode = newNode;
    } else {
      newNode.next = topNode;
      topNode = newNode;
    }
    size++;
  }

  public void pop() {
    if (size == 0)
      return;

    topNode = topNode.next;
    size--;
  }

  public DataNode<Integer> peek(){
    if(size == 0){
      return null;
    }

    return topNode;
  }
}
