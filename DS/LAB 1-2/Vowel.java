import java.util.Scanner;
public class Vowel{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter charcter");
        char ch;
        ch=sc.next().toLowerCase().charAt(0);
        if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
            System.out.println("charcter is Vowel");

        }
        else{
           System.out.println("charcter is not Vowel"); 
        }
    }
}