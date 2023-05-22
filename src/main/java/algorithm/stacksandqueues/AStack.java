package algorithm.stacksandqueues;

public class AStack {
  private DataNode<Integer> topNode = null;
  private int size = 0;

  public AStack next = null;

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

  public DataNode<Integer> pop() {
    if (size == 0)
      return null;

    DataNode<Integer> returnNode = topNode;
    topNode = topNode.next;
    size--;
    return  returnNode;
  }

  public DataNode<Integer> peek(){
    if(size == 0){
      return null;
    }

    return topNode;
  }

  public int size(){
    return size;
  }

  public void printAll(){
    DataNode<Integer> currentNode = topNode;
    while(currentNode != null){
      System.out.print(currentNode.data + " ");
      currentNode = currentNode.next;
    }
  }
}
