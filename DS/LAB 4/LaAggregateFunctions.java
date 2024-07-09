import java.util.Scanner;
class AggregateFunc{
	public int max(int[] a) {
      int max = 0;

      for(int i=0; i<a.length; i++ ) {
         if(a[i]>max) {
            max = a[i];
         }
      }
      return max;
   }

   public int min(int[] a) {
      int min = a[0];
   
      for(int i = 0; i<a.length; i++ ) {
         if(a[i]<min) {
            min = a[i];
         }
      }
      return min;
   }
   public int sum(int[] a) {
   	int sum = 0;
      for(int i=0; i<a.length; i++ ){
            sum += a[i];
      }
      return sum;
   }

   public double avg(int[] a) {
      int sum = 0;
      double avg = 0;
   
      for(int i = 0; i<a.length; i++ ) {
            sum += a[i];
      }
      avg = sum/a.length;
      return avg;
   }
}

public class LaAggregateFunctions{
	public static void main(String[] args){
		AggregateFunctions ag = new AggregateFunctions();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();

		int[] a = new int[n];
		for(int i=0;i<a.length;i++){
			System.out.print("\nEnter element a["+i+"] : ");
			a[i] = sc.nextInt();
		}

		int max = ag.max(a);
		int min = ag.min(a);
		int sum = ag.sum(a);
		double avg = ag.avg(a);

		System.out.println("Max = "+max);
		System.out.println("Min = "+min);
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+avg);
	}
}
