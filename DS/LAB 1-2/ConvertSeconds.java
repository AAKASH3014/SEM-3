import java.util.Scanner;
public class ConvertSeconds{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter time in seconds : ");
		int a = sc.nextInt();
		int h = 0;
		int m = 0;
		int s = 0;

		while(a>3600){
			a = a - 3600;
			h++;
		}
		while(a>60){
			a = a - 60;
			m++;
		}
		s = a;

		System.out.print("Time in HH:MM:SS = "+h+":"+m+":"+s);
	}
}