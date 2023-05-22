// An algorithm that mimics stacking of dishes in real life. The SetOfStacks is a collection of multiple stacks where,
// anew stack is created after the previous one exceeds the capacity.
package algorithm.stacksandqueues;

import java.text.MessageFormat;

public class SetOfStacks {
    private int capacity;

    private StackOfStacks stackCollection = new StackOfStacks();

    public SetOfStacks(int threshold){
        capacity = threshold;
        AStack stack = new AStack();
        stackCollection.push(stack);
    }

    public void push(int data){
        if(stackCollection.peek().size() < capacity) {
            stackCollection.peek().push(data);
        } else {
            AStack newStack = new AStack();
            stackCollection.push(newStack);
            stackCollection.peek().push(data);
        }
    }

    public void printAll(){
        for(int i = 0; i < stackCollection.count(); i++){
            System.out.print(MessageFormat.format("Stack {0}: ", i));
            stackCollection.getStackAtIndex(i).printAll();
            System.out.println();
        }
    }

    public DataNode<Integer> pop(){
        DataNode<Integer> returnNode;
        if(stackCollection.count() < 1)
            return null;

        if(stackCollection.peek().size() == 1){
            returnNode = stackCollection.peek().pop();
            stackCollection.pop();
        } else {
            returnNode = stackCollection.peek().pop();
        }

        return returnNode;
    }
}
