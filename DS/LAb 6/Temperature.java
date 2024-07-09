import java.util.Scanner;
class ConvertTemperature{
	public void CelsToFahr(double tc){
		double f = 9/5f * tc + 32;
		System.out.println("Temperature in Fahrenheit : "+f);
	}
	public void FahrToCels(double tf){
		double c = (tf - 32) * (5/9f);
		System.out.println("Temperature in Celsius : "+c);
	}
}

public class Temperature{
	public static void main(String[] args) {
		ConvertTemperature c = new ConvertTemperature();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature unit : ");
		String s = sc.next();

		if(s.equals("celsius")){
			System.out.print("Enter temperature in celsius : ");
			double tc = sc.nextDouble();

			c.CelsToFahr(tc);
		}
		else if(s.equals("fahrenheit")){
			System.out.print("Enter temperature in fahrenheit : ");
			double tf = sc.nextDouble();

			c.FahrToCels(tf);
		}
		else{
			System.out.print("Invalid unit");
		}
	}
}