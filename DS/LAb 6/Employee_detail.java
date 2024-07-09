import java.util.Scanner;
class InnerEmployee_detail {
    InnerEmployee_detail(int id,
    String name,
    String decination,
    double salary){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("decination:"+decination);
        System.out.println("salary:"+salary);


    }

    
}

public class Employee_detail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("id");
        int id = sc.nextInt();
        System.out.println("name:");
        String name = sc.next();
        System.out.println("decination:");
        String decination = sc.next();
        System.out.println("salary");
        double salary = sc.nextDouble();
        InnerEmployee_detail i1 = new InnerEmployee_detail(id, name, decination, salary);



    }
}
