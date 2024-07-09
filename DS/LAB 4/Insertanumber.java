import java.util.Scanner;
public class Insertanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 1, 2, 3, 5, 6 };

        System.out.print("Array is : 1,2,3,5,6");
        System.out.print("\nEnter the number : ");
        int num = sc.nextInt();

        System.out.print("Enter the index : ");
        int index = sc.nextInt();

        int[] b = new int[a.length + 1];

        for (int i = 0; i < b.length; i++) {
            if (i < index) {
                b[i] = a[i];
            } else if (i == index) {
                b[i] = num;
            } else {
                b[i] = a[i - 1];
            }
        }

        System.out.print("Modified array is : ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ", ");
        }
        System.out.print("\b\b ");
    }

}
