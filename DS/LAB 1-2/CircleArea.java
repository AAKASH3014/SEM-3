import java.util.Scanner;
public class CircleArea{
    public static void main(String[] args){
        System.out.println("Enter radius");
        Scanner sc = new Scanner(System.in);
        
        double radius=sc.nextDouble();
        System.out.println("area="+Math.PI*radius*radius);

    }
}