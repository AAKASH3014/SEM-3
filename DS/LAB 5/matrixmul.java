import java.util.Scanner;
public class matrixmul {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][2];
		int[][] b = new int[2][3];
		int[][] c = new int[3][3];
		int sum =0;
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.print("Enter element "+i+","+j+": ");
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print("Enter element "+i+","+j+" : ");
				b[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				sum=0;
				for(int k=0;k<2;k++){
					sum=sum+(b[k][j]*a[i][k]);
				}
				c[i][j]=sum;
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
