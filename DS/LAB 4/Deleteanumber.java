import java.util.Scanner;
public class Deleteanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter element in array");
            array[i] = sc.nextInt();
        
        }
        int index=0;
        System.out.println("enter element to delete element in array:");
        int element = sc.nextInt();
        int array2[] = new int[n-1];
        for(int i= array2.length-1;i>=0;i++){
            if(array[i]==element){
                index =i;

            }
        }
        for(int i= array2.length-1;i>=0;i++){
            if(array[i]==element){
                index =i;

            }
        }


    }
    
}
