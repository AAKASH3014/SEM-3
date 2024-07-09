import java.util.Scanner;

public class Factorilrection {
    public static int fact(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (fact(num - 1) * num);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number = ");
        int num = sc.nextInt();
        System.out.println("Your ans is = " + (fact(num)));

    }
}
