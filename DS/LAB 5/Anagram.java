import java.util.Scanner;
public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words : ");
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter word "+(i+1)+" : ");
            s[i]=sc.next();
        }
        int random = (int)(Math.random()*n);
        System.out.print("The randomly generated word is : "+s[random]);
        System.out.print("\nEnter the anagram of given word : ");
        String s1 = sc.next();
        boolean isFound=false;
        for(int i=0;i<s[random].length();i++){
            isFound=false;
            for(int j=0;j<s1.length();j++){
                if(s[random].charAt(i)==s1.charAt(j)){
                    isFound=true;
                }
            }
            if(!isFound){
                break;
            }
        }
        if(isFound){
            System.out.println("Anagram");
        }else{
            System.out.println("Not anagram");
        }
    }

    
}
