import java.util.Scanner;

public class TwoArrarys {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("������9������");
		int[][] a=new int [3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=input.nextInt();
			}	
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+"  ");
			}
			System.out.println("");
		}
		input.close();
	}

}