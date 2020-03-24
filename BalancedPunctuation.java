package assignment3;
//Linh Nguyen
import algs4.StdIn;
import algs4.StdOut;
import week3inclass.ArrayStack;

public class BalancedPunctuation {
	public static void main(String[] args) {
		StdOut.print("Enter a string of punctuation: ");
		String uinput=StdIn.readLine();
		boolean bpunc = balancedPunctuation(uinput);
		if(bpunc==true) {
			StdOut.println("This String is balanced");
		}
		else if (bpunc==false){
			StdOut.println("This String is not balanced.");
		}
		//how to return a thing
		
	}
	
	public static boolean balancedPunctuation(String uS) {
		ArrayStack<Character> stack = new ArrayStack<>(uS.length());
		for(int i = 0; i<uS.length();i++) {//need to go through array
			char c = uS.charAt(i);
			if(c=='(' || c=='[' || c=='{') {
				stack.push(c);
	
			}
			else if (c == ')' || c==']' || c=='}') {
				if (stack.isEmpty()) {
					return false;
				}
				else {
					char scheck =stack.pop();
					if((c==')'&& scheck!='(')||(c==']' && scheck !='[')||(c=='}'&&scheck !='{')) {
						//doesn't match
						return false;
					}
					else if(uS.isEmpty()==true) {
						return true;
					}
				}//else stack not empty after right punc
			}//else if right punc
		}//for loop
		if (stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

}
