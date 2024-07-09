import java.util.Scanner;
public class AscendingDelete{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {1,2,5,7,10,12};
		System.out.print("Array is : 1,2,5,7,10,12");

		System.out.print("\nEnter the number : ");
		int num = sc.nextInt();
		int index = 0;
		int c = 0;

		for(int i=0;i<a.length;i++){
			if(a[i]==num){

			}else{
				c++;
			}
		}

		if(c==a.length){
			System.out.print("NUMBER DOES NOT EXIST");
		}
		else{
			int[] b = new int[a.length-1];

			for(int i=0;i<b.length;i++){
				if(a[i]<num){
					b[i]=a[i];
				}
				else{
					index=i;
					break;
				}
			}
			for(int i=index;i<b.length;i++){
				b[i]=a[i+1];
			}

			System.out.print("Modifiedd array is : ");
			for(int i=0;i<b.length;i++){
				System.out.print(b[i]+", ");
			}
			System.out.print("\b\b ");			
		}
	}
}