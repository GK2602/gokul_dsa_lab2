package dsa;

import java.util.Stack;

public class Bracketcheck {
  public static boolean isBalanced(String input) {
    Stack<Character> stack = new Stack<>();
    for (char c : input.toCharArray()) {
      if (c == '(' || c == '[' || c == '[' || c == '{') {
        stack.push(c);
      } else if (c == ')' || c == ']' || c == ']' || c == '}') {
        if (stack.isEmpty()) {
          return false;
        }
        char top = stack.pop();
        if (c == ')' && top != '(' || c == ']' && top != '[' || c == ']' && top != '[' || c == '}' && top != '{'){ 
          return false;
        }
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
  
	  String input1 = "({[]})";
    
      String input2 = "([[{}]]))";
    
    
    if (isBalanced(input1)) {
      System.out.println("The entered String " + input1  +" has Balanced Brackets");
    } else {
      System.out.println("The entered String "+ input1+ " do not contain Balanced Brackets");
    }
    if (isBalanced(input2)) {
        System.out.println("The entered String " + input2  +" has Balanced Brackets");
      } else {
        System.out.println("The entered String "+ input2+ " do not contain Balanced Brackets");
      }
  }
}

