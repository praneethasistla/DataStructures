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
public class MinStack {
    Stack<Integer> s;
    int min;
    
    MinStack(){
        s = new Stack<Integer>();
    }
    
    void push(int x){
        if (s.isEmpty()){
            min = x;
            s.push(x);
        } else {
            s.push(min-x);
            if(min>x)
                min = x;
        }
    }
    
    int pop(){
        int temp = s.peek();
        if(temp < 0){//this number is greater than minimum
            s.pop();
            return temp + min;
        }
        else{
            s.pop();
            int tmp = min;
            min = min + temp;
            return tmp;
        }
    }
    
    int peek(){
        return s.peek()<0 ? s.peek()+min : min;  
    }
    
    int min(){
        return min;
    }
}
