import java.util.Scanner;

public class firsttonavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("enter last number:");
        int lnum = sc.nextInt();
        for (int i = 0; i <= lnum; i++) {
            sum += i;
        }
        System.out.println("sum is :" + (sum/(lnum*1.0)));
    }
}
