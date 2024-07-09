import java.util.Scanner;
class StackFunctions{
	int n = 0;
	int top = -1;
	int[] s ;

	public StackFunctions(int n){
		this.n = n;
		s = new int[n];
	}

	int k = 0;
	public void push(int x){
		if(top>=n-1){
			System.out.println("STACK OVERFLOW");
			return;
		}
		else{
			top++;
			s[top]=x;
			k++;
		}
	}

	public int pop(){
		if(top<0){
			System.out.println("STACK UNDERFLOW");
			return 0;
		}
		else{
			top--;
			k--;
			return(s[top+1]);
		}
	}


	public int peep(int i){
		if((top-i+1) <= -1){
			System.out.println("STACK UNDERFLOW");
			return 0;
		}
		else{
			return (s[top-i+1]);
		}
	}

	public int change(int i,int x){
		if((top-i+1) <= -1){
			System.out.println("STACK UNDERFLOW");
			return 0;
		}
		else{
			s[top-i+1] = x;
			return (s[top-i+1]);
		}
	}

	public void display(){
		for(int i=0;i<k;i++){
			System.out.print(s[i]+" ");
		}
	}
}


public class Stackmethod{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of stack : ");
		int n = sc.nextInt();

		StackFunctions sf = new StackFunctions(n);
		int temp = 0;
		while(temp!=6){
			System.out.println("\nEnter \n1 to push \n2 to pop \n3 to peep \n4 to change \n5 to display \nand 6 to exit");
			temp = sc.nextInt();

			if(temp==1){
				System.out.print("\nEnter the element to push : ");
				int x = sc.nextInt();

				sf.push(x);
			}
			else if(temp==2){
				int p = sf.pop();
				System.out.print("element is : "+p);
			}
			else if(temp==3){
				System.out.print("\nEnter the index from top : ");
				int index = sc.nextInt();
				int p = sf.peep(index);
				System.out.print("\n"+index+"th element is : "+p);
			}
			else if(temp==4){
				System.out.print("\nEnter the index from top : ");
				int index = sc.nextInt();
				System.out.print("\nEnter new element : ");
				int x = sc.nextInt();
				int p = sf.change(index,x);
				System.out.print("\n"+index+"th element changed to :"+p);
			}
			else if(temp==5){
				sf.display();
			}
			else{
				System.out.print("\nProgram terminated");
			}
		} 
	}
}