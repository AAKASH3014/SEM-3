import java.util.Scanner;

class InnerSwaptownummber {

    InnerSwaptownummber(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a" + a + "b" + b);

    }

}

public class Swaptownummber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter frist number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        InnerSwaptownummber i1 = new InnerSwaptownummber(a, b);

    }

}
