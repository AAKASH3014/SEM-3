import java.util.Scanner;
class Stack{
    int top = -1;
    int n;
    char[] a;

    Stack(int n) {
        this.n = n;
        a = new char[n];
    }

    void push(char x) {
        if (top >= (n-1)){
            System.out.println("Stack Overflow");
        }else{
            top++;
            a[top] = x;
        }
        return;
    }

    int pop() {
        if (top < 0) {
            return 0;
        } else {
            top--;
            return a[top+1];
        }
    }

}

public class Recognizestrings{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();

        Stack sk = new Stack(s.length());

        sk.push('c');
        int index = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='c'){
				index = i;
				break;
			}
			else{
				sk.push(s.charAt(i));
			}
		}

        boolean isFound = true;
		for(int i=index+1;i<s.length();i++){
			if(sk.pop()!=s.charAt(i)){
                isFound = false;
            }
		}
		
		if(!isFound){
            System.out.println("Invalid String");
        }else{
            System.out.println("Valid String");
        }

	}
}