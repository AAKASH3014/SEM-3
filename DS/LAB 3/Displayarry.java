import java.util.Scanner;

public class Displayarry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println("enter size of array");
        count = sc.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter number :");
            array[i] = sc.nextInt();
        }
        System.out.println("array :");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
    }
}