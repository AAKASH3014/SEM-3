import java.util.Scanner;

public class calmtonnum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("enter first number:");
        int fnum=sc.nextInt();
        System.out.println("enter second number:");
        int snum=sc.nextInt();
        for(int i=fnum;i<=snum;i++)
        {
            sum+=i;
        }
        System.out.println("sum is :"+sum);
    }
}
