import java.util.Scanner;

public class yanghuisanjiao {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入杨辉三角的行数：");
		int row=input.nextInt();
		int[][] a=new int[row][];
		for(int k=0;k<row;k++){
			a[k]=new int[k+1]; 
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<a[i].length;j++){
				if(j==0 || i==j){
					a[i][j]=1;
				}else{
					a[i][j]=a[i-1][j]+a[i-1][j-1];	
				}
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+"  ");
			}
			System.out.println("");
		}
		input.close();
	}

}
