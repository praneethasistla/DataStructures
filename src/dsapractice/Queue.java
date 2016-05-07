/*
 * Implementing queue with two stacks and their functions
 */
package dsapractice;

import java.util.Stack;

/**
 *
 * @author Praneetha
 */
public class Queue {
    Stack<Integer> top;
    Stack<Integer> bottom;
    int size=0;
    
    int size(){
        return size;
    }
    
    void enqueue(int x){
        while(!bottom.isEmpty()){
            top.push(bottom.pop());
            top.push(x);
        }
        while(!top.isEmpty()){
            bottom.push(top.pop());
        }
        size++;
    }
    
    int dequeue(){
        size--;
        return bottom.isEmpty()? null: bottom.pop();
    }
}
