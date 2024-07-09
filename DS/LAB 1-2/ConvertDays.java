import java.util.Scanner;
public class ConvertDays{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter days : ");
		int a = sc.nextInt();
		int b = a;
		int y = 0;
		int w = 0;
		int d = 0;

		while(a>365){
			a = a - 365;
			y++;
		}
		while(a>7){
			a = a - 7;
			w++;
		}
		d = a;

		System.out.print(b+" days are equal to "+y+" year "+w+" week "+d+" days");
	}
}