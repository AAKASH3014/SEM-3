import java.util.Scanner;

public class duplicate {
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
        int duplicate=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicate=1;
                    break;
                }
            }

        }
        if (duplicate==1) {
            System.out.println("duplicate included");
            
        }
        else{
            System.out.println(" duplicate not included");
        }
    }
}
