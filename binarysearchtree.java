package dsa;

import java.util.Stack;

class Node {
	  int value;
	  Node left;
	  Node right;

	  Node(int value) {
	    this.value = value;
	    left = null;
	    right = null;
	  }
	}
public class binarysearchtree {
		  static boolean findPair(Node root, int sum) {
		    Stack<Node> s1 = new Stack<>();
		    Stack<Node> s2 = new Stack<>();

		    Node current1 = root;
		    Node current2 = root;

		    while (current1 != null || !s1.isEmpty() || current2 != null || !s2.isEmpty()) {
		      if (current1 != null) {
		        s1.push(current1);
		        current1 = current1.left;
		      } else if (current2 != null) {
		        s2.push(current2);
		        current2 = current2.right;
		      } else {
		        Node n1 = s1.peek();
		        Node n2 = s2.peek();
		        int x = n1.value + n2.value;
		        if (x == sum) {
		          System.out.println("Pair Found: " + n1.value + ", " + n2.value);
		          return true;
		        }
		        if (x < sum) {
		          current1 = n1.right;
		          s1.pop();
		        } else {
		          current2 = n2.left;
		          s2.pop();
		        }
		      }
		    }

		    System.out.println("Pair not found");
		    return false;
		  }

		  public static void main(String[] args) {
			  
		    Node root = new Node(40);
		    root.left = new Node(20);
		    root.right = new Node(60);
		    root.left.left = new Node(10);
		    root.left.right = new Node(30);
		    root.right.left = new Node(50);
		    root.right.right = new Node(70);

		    int sum = 130;

		    findPair(root, sum);
		  }
		}


