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
public class DSApractice {

    /**
     * @param args the command line arguments
     */
    Stack<Integer> sort(Stack<Integer> s){
        Stack<Integer> r = new Stack<Integer>();
        while (!s.isEmpty()){
            int temp = s.pop();
            while(!r.isEmpty() && r.peek() < temp){
                s.push(r.pop());
            }
            r.push(temp);
        }
        return r;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
