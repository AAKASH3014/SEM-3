import java.util.Scanner;

public class position {
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
        int index=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index=i;
                }
            }
        }
        System.out.println("smallest index is :" + index);

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[index]) {
                    index=i;
                }
            } 
        }
        System.out.println("largest index is :" + index);

    }
}
