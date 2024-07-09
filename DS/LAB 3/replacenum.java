//Read n numbers in an array then read two different numbers, replace 1st
//number with 2nd number in an array and print its index and final array.

import java.util.Scanner;

public class replacenum {
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
        System.out.println(" number is  :");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        System.out.println("first  number is  :");
        int fnum = sc.nextInt();
        System.out.println("second  number is  :");
        int snum = sc.nextInt();
        int temp = 0;
        int index1 = 0, index2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == fnum) {
                index1 = i;
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == snum) {
                index2 = i;
            }

        }
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        System.out.println("index is " + index1+"," + index2);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}
