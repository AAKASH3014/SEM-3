import java.util.Scanner;

class Student_Detail{
	Scanner sc = new Scanner(System.in);
	int Enrollment_No;
	String Name;
	int Semester;
	double cpi;

	public void readDetails(){
		System.out.print("\nEnter Name : ");
		this.Name = sc.nextLine();

		System.out.print("Enter Semester : ");
		this.Semester = sc.nextInt();

		System.out.print("Enter Enrollment_No : ");
		this.Enrollment_No = sc.nextInt();

		System.out.print("Enter Salary : ");
		this.cpi = sc.nextDouble();
	}

	public void printDetails(){
		System.out.print("\nEnrollment_No = "+this.Enrollment_No);
		System.out.print("\nName = "+this.Name);
		System.out.print("\nSemester = "+this.Semester);
		System.out.print("\ncpi = "+this.cpi);
	}
}

public class Stuarrayofobj{
	public static void main(String[] args){
		Student_Detail[] a = new Student_Detail[5];
		for(int i=0;i<5;i++){
			System.out.print("\nInput Details of Student "+(i+1));
			a[i] = new Student_Detail();
			a[i].readDetails();
		}
		for(int i=0;i<5;i++){
			System.out.print("\n\nDetails of Student "+(i+1));
			a[i].printDetails();
		}
	}
}