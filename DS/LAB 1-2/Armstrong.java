import java.util.Scanner;
public class Armstrong{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rem = 0;
		int rem1 = 0;
		int b = 0;
		int c = 0;
		double ans = 0;
		for(int i=153;i<154;i++){
			b=i;
			if(i>0 && i<10){
				ans = Math.pow(i,1); 
				if(ans == b){
					System.out.print("b");
				}	
			}
			else if(i>10 && i<100){
				rem = i % 10;
				i = i / 10;
				ans = Math.pow(rem,2)+Math.pow(i,2);
				if(ans == b){
					System.out.print("");
				}	
			}
			else{
				rem = i % 10;
				rem1 = i % 100;
				rem1 = rem1 / 10;
				i = i / 100;

				ans = Math.pow(i,3)+Math.pow(rem1,3)+Math.pow(rem,3);
				if(ans==b){
					System.out.print(i);
				}	
			}
			// System.out.print(rem+" "+rem1+" "+i);
		}	
	}
}