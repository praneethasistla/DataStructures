/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    }
    
    int dequeue(){
        return bottom.isEmpty()? null: bottom.pop();
    }
}
