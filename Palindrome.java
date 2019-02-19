/******************************************************************************
 *  _Example commands for running this file_
 *  Compilation:  javac -Xlint Palindrome.java
 *  Execution:    java Palindrome
 *
 *  Example code reverses the input array. Edit this file
 *  to check whether the input is a palindrome.
 *
 ******************************************************************************/


import java.util.Arrays;
import java.util.Stack;

public class Palindrome {

  // Sample input
  public static int[] input = {0,1,2,1,0};

  public static void main(String[] args){
    // Display Input
    System.out.println("Input:\t" + Arrays.toString(input));

    // Create an empty stack
    Stack<Integer> stack = new Stack<Integer>();
    for(int i=0; i<input.length; i++){
      // One by one push all characters of string to stack.
      stack.push(input[i]);
    }

    // Save the reversed input string
    String reversed = "";
    while(!stack.empty()){
      //One by one pop all characters from stack and put them back to string.
      reversed += Integer.toString(stack.pop());
    }

    // Display reversed as string array
    System.out.println("Output:\t" + Arrays.toString(reversed.split("")));
  } // end main

}// end class Palindrome
