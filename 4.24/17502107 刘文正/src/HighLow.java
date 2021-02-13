import java.util.Arrays;
import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入5个分数：");
		int[] a=new int[5];
		for(int i=0;i<5;i++){
			a[i]=input.nextInt();
		}
		Arrays.sort(a);
		//for(int i=0;i<5;i++){
		//	System.out.print(a[i]+"  ");
		//}
		
		double sum=0,aver;
		for(int i=1;i<4;i++){
			sum+=a[i];
		}
		aver=sum/3;
		System.out.println(" ");
		System.out.print("选手最后得分为："+aver);
		input.close();
	}

}
